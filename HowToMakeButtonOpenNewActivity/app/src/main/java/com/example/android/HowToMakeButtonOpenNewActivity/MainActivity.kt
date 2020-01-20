package com.example.android.HowToMakeButtonOpenNewActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            openActivity2()
        }
    }


    fun openActivity2(){
        val intent = Intent(this, Activity2::class.java)
        startActivity(intent)
    }

}
