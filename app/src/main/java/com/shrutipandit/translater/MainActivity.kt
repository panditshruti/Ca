package com.shrutipandit.translater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.shrutipandit.translater.databinding.ActivityMainBinding
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.apply {
            btn1.setOnClickListener {
            }
            btn2.setOnClickListener {
            }
            btn3.setOnClickListener {

            }
            btn4.setOnClickListener {


            }
        }
    }
}
