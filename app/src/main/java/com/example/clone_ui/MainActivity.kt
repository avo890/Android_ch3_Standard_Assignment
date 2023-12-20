package com.example.clone_ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val btn_search : Button by lazy {
        findViewById(R.id.btn_search)
    }
    private val btn_floating : FloatingActionButton by lazy {
        findViewById(R.id.btn_floating)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_search.setOnClickListener{
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }


        btn_floating.setOnClickListener{
            val intent = Intent(this, SelectImageActivity::class.java)
            startActivity(intent)
        }

    }
}