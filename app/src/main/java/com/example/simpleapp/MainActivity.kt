package com.example.simpleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val et_user_name = findViewById(R.id.et_user_name) as EditText
        val et_password = findViewById(R.id.et_password) as EditText
        val btn_reset = findViewById(R.id.btn_reset) as Button
        val btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {

            et_user_name.setText("")
            et_password.setText("")
        }

        // set on-click listener
        btn_submit.setOnClickListener {
            val user_name = et_user_name.text;
            val password = et_password.text;
            Toast.makeText(this@MainActivity, "Selamat Datang$user_name", Toast.LENGTH_LONG).show()

            // your code to validate the user_name and password combination
            // and verify the same

        }
    }
}