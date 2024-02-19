package com.example.bts_lecture

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image1 = findViewById<ImageView>(R.id.bts_image_1)
        image1.setOnClickListener {

            Toast.makeText(this, "1 click", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }

        val image2 = findViewById<ImageView>(R.id.bts_image_2)
        image2.setOnClickListener {

            Toast.makeText(this, "2 click", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)

        }

        val image3 = findViewById<ImageView>(R.id.bts_image_3)
        image3.setOnClickListener {

            Toast.makeText(this, "3 click", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)
        }

    }

}