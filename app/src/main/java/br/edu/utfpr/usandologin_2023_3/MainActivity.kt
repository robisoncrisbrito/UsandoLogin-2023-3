package br.edu.utfpr.usandologin_2023_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLogin = findViewById( R.id.btLogin )

        btLogin.setOnClickListener {
            tratarLogin()
        }
    }

    private fun tratarLogin() {
        
    }
}