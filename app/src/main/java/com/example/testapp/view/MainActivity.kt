package com.example.testapp.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.core.view.isNotEmpty
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.model.User
import com.example.testapp.model.UserProvider

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var userProvider:UserProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLoginIn.setOnClickListener{ LogiinIn() }

        //var btnLoginIn = findViewById<Button>(R.id.btnLoginIn)
        //btnLoginIn.setOnClickListener { launchError() }

        //Navegar entre activities
        /*
        val intent = Intent(this, MenuPrincipal::class.java)
        intent.putExtra("User", "Test")
        startActivity(intent)*/
    }

    fun LogiinIn(){

        //Crear Instancia de UserProvider
        userProvider = UserProvider()

        val Username = binding.txtUsername.editText?.text.toString()
        val Pass = binding.txtPass.editText?.text.toString()

        toastError(Username)

        if(Username.isNotBlank() && Pass.isNotBlank()){
            if(userProvider.UserExists(Username)){
                if(userProvider.ValidatePass(Username, Pass)){
                    val intent = Intent(
                        this,
                        MenuPrincipal::class.java
                    )
                    intent.putExtra("User", userProvider.getUser(Username))
                    startActivity(intent)
                }
            }
        }else{
            toastError("Debes completar todos los campos!")
        }


    }


    fun launchError(){

        toastError("HOLA")

    }

    fun toastError(msg:String){

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }
}