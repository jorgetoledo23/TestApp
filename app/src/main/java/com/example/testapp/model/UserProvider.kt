package com.example.testapp.model

class UserProvider {

    private val Usuarios = listOf<User>(
        User(Username = "admin@inacapmail.cl",
            Password = "123456"),
        User(Username = "director@inacapmail.cl",
            Password = "123456"),
        User(Username = "estudiante@inacapmail.cl",
            Password = "123456")
    )

    fun getAllUsers(): List<User> {
        return this.Usuarios
    }

    fun UserExists(Username:String):Boolean{
        return Usuarios.any { it.Username == Username }
    }

    fun ValidatePass(Username: String, Password:String):Boolean{
        return Usuarios.any { it.Username == Username && it.Password == Password }
    }

}