package com.example.intentagain

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MoveWithData : AppCompatActivity(), View.OnClickListener {
    private lateinit var tvDataReceived:TextView
    private lateinit var btnThisIsBackToActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataReceived = findViewById(R.id.tv_data_received)
        DataReceived()

        btnThisIsBackToActivity = findViewById(R.id.btn_this_isback_to_activity)
        btnThisIsBackToActivity.setOnClickListener(this)
    }

    private fun DataReceived() {
        val bundle = intent.extras
        val club = bundle?.getString("Club")
        val kepanjangan = bundle?.getString("Kepanjangan")

        tvDataReceived.text = club + " " + kepanjangan
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