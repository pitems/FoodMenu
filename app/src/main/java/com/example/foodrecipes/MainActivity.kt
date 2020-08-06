package com.example.foodrecipes

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.food_ticket.view.*

class MainActivity : AppCompatActivity() {
    var adapter:FoodAdapter?=null
    var listOfFoods = ArrayList<Food>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //load Foods
        listOfFoods.add(Food("Coffe","Hot wakeup drink",R.drawable.ic_drink))
        listOfFoods.add(Food("Espresso","Hot coomon drink",R.drawable.ic_espresso))
        listOfFoods.add(Food("French Fries","Delicious Salty Goodness",R.drawable.ic_french_fries))
        listOfFoods.add(Food("Honey","Delicious sugary goodness",R.drawable.ic_honey))
        listOfFoods.add(Food("Strawberry Cake","Delicious Fat creator",R.drawable.ic_strawberry))
        listOfFoods.add(Food("Sugar Cube","Delicious Sugary Cube",R.drawable.ic_sugar))
        adapter= FoodAdapter(this,listOfFoods)


        //this is our gridview and we are giving it our adapter with all the objects created below
        gvListFood.adapter=adapter
    }

    //So what is all this nonsense you might ask well i will try to explain this to me in case i forgot
    class FoodAdapter:BaseAdapter{
        var listOfFood=ArrayList<Food>()//This class has a list the same type as above but empty
        var context:Context?=null//the application context waiting for the context tha will be given below
        constructor(context: Context,listOfFood:ArrayList<Food>):super(){
            this.context=context//it will receive a context
            this.listOfFood=listOfFood //it will receive an object of type listOfFood
        }
        //Because is an Adapter this override function will help us inflate our food_ticket activity on the
        //grid view on the main activity
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val food = this. listOfFood[p0] //is a variable of type Food the p0 it's because it iterates the listOfFood
            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater // the inflator variable
            var foodView = inflator.inflate(R.layout.food_ticket,null) //Setting up what will be inflated
            foodView.ivFoodImage.setImageResource(food.image!!) //Setting the image on the inflated layout
            foodView.ivFoodImage.setOnClickListener{ //Making the layout inflated clickable

                val intent= Intent(context, FoodDetails::class.java) //the intent to call 2nd activity
                intent.putExtra("name",food.name) //adding extra data to the 2nd activity
                intent.putExtra("des",food.des)
                intent.putExtra("image",food.image!!)
                context!!.startActivity(intent) //calling the second activity

            }
            foodView.tvName.text=food.name!! // setting up the name on the layout activity
            return foodView //returns the created object to the gridview
        }

        override fun getItem(p0: Int): Any {
            return listOfFood[p0] //just get the item on this position
        }

        override fun getItemId(p0: Int): Long {
           return p0.toLong()
        }

        override fun getCount(): Int {
          return listOfFood.size //get the amount of objects on the list
        }
    }

}