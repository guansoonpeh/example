package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var student : Student

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btnSetValue.setOnClickListener(){
            student = Student("Ali", 20, "RSD")
            binding.myData = student
        }

        binding.btnDisplay.setOnClickListener(){
            student.programme = "RIS"
            student.age = 21

            binding.apply {
                invalidateAll()
            }

        }

    }
}