package app.chat.com.chat

import android.app.Activity
import android.os.Bundle

/**
 * Created by Sushil Chaurasiya on 11/10/2018.
 */
class KotlinTest : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello Word")


    }
}