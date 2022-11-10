package com.codedev.android_cicd_jenkins

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Btntest = findViewById<Button>(R.id.Btntest)

        Btntest.setOnClickListener {
            Toast.makeText(this,"CI/CD Using Jenkins!!!",Toast.LENGTH_LONG).show()
        }
    }







}