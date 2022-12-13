package com.example.kms

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ltrs = findViewById<EditText>(R.id.LTR)
        val kms = findViewById<EditText>(R.id.KMS)
        val btn = findViewById<Button>(R.id.retry)
        val myDialoug = Dialog(this)
        myDialoug.setContentView(R.layout.popup)
        myDialoug.setCancelable(true)
        myDialoug.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        myDialoug.show()

        btn.setOnClickListener() {
            val l = ltrs.text.toString().toFloat()
            val k = kms.text.toString().toFloat()

            var avg = k / l
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("average", avg);
            startActivity(intent)
        }
    }
}

