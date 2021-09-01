package com.example.testapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.R
import com.example.testapp.databinding.ActivityMainBinding
import com.example.testapp.databinding.ActivityMenuPrincipalBinding
import com.example.testapp.model.User

class MenuPrincipal : AppCompatActivity() {

    private lateinit var binding: ActivityMenuPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val User:User = bundle?.getSerializable("User") as User

        binding.topAppBar.title = User.Username


    }
}