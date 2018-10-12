package app.chat.com.chat

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.kotlin_test.*


/**
 * Created by Sushil Chaurasiya on 11/10/2018.
 */
class KotlinTest : AppCompatActivity()
{

 val moviename : ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_test)

       // mainActivityEditText.setText("Welcome Kotlin")

        println("Hello Word")
        val c : Int =  printSum1(13, 8)
        //   println("Hello Sum of the nubmer is $c")

        println("Hello Sum of the nubmer is "+c)
        //printSum(9,9)

        Toast.makeText(this,"Welcome to Kotlin Toast Test",Toast.LENGTH_SHORT).show()


        moviename.add("abcd")
        moviename.add("efgh")
        moviename.add("ijkl")
        moviename.add("mnop")
        moviename.add("gfgdf")
        moviename.add("dsg")
        moviename.add("bcvn")
        moviename.add("qwwrq")
        moviename.add("mhjgg")
        moviename.add("vnhhhhh")

        val values = arrayOf(
                "Rick and Morty",
                "Gaeme of Thrones",
                "Silicon Valley",
                "IT Crowd",
                "Person of Interest")


      //  mainActivityRecyclerView.layoutManager = LinearLayoutManager(this)
     //   mainActivityRecyclerView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, moviename)
        mainActivityRecyclerView.setAdapter(ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values))

        // Set an item click listener for ListView
        mainActivityRecyclerView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // Get the selected item text from ListView
            val name : String = moviename.get(position)
            Toast.makeText(this, "Movie name is $name and position is "+position, Toast.LENGTH_SHORT).show()
        }

        mainActivitySendButton.setOnClickListener(View.OnClickListener {

            Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)

            val num = 4
            val string_num:String = num.toString()

            val num1: Int = string_num.toInt()

        })
    }

    fun printSum(a: Int, b: Int) {
        println(" Hello Word sum of $a and $b is ${a + b}")
    }

    fun printSum1(a: Int, b: Int) :Int {
        val c : Int
        c= a+b
        return c
    }

}