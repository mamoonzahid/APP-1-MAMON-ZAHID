package com.example.kms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.math.roundToInt

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var avg = intent.getFloatExtra("average",0.0f).roundToInt()
        ans.text = "$avg kilometer per ltr"
        retry.setOnClickListener {
            val intent = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(intent)
        }
    }
}