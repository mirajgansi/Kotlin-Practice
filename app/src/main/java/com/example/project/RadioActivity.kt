package com.example.project

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RadioActivity : AppCompatActivity() {
    lateinit var Banana:RadioButton
    lateinit var Apple:RadioButton
    lateinit var Pineapple:RadioButton
    lateinit var image:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio)
        Banana= findViewById(R.id.radioBanana)
        Apple= findViewById(R.id.radioApple)
        Pineapple= findViewById(R.id.radioPineapple)
        image=findViewById(R.id.imageRadio)

        Banana.setOnClickListener{
            image.setImageResource(R.drawable.banana)
        }
      Apple.setOnClickListener{
                image.setImageResource(R.drawable.apple)
            }
        Pineapple.setOnClickListener{
                image.setImageResource(R.drawable.pineapple)
            }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}