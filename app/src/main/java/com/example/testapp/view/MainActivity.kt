package com.example.testapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginIn.setOnClickListener{ launchError() }

        //var btnLoginIn = findViewById<Button>(R.id.btnLoginIn)
        //btnLoginIn.setOnClickListener { launchError() }





    }

    fun launchError(){

        toastError("HOLA")

    }

    fun toastError(msg:String){

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}