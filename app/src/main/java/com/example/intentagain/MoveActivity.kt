package com.example.intentagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnThisIsBackToActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnThisIsBackToActivity = findViewById(R.id.btn_this_isback_to_activity)
        btnThisIsBackToActivity.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        if (v !=null) {
            when (v.id) {
                R.id.btn_this_isback_to_activity -> run {
                    val intent = Intent (this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}