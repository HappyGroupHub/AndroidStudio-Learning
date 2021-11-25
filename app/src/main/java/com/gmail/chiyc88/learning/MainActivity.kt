package com.gmail.chiyc88.learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_rpsGame = findViewById<Button>(R.id.btn_rpsGame)
        val intent_rpsGame = Intent(this, RpsGameActivity::class.java)
        btn_rpsGame.setOnClickListener {
            startActivity(intent_rpsGame)
        }
    }
}