package com.example.clone_ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clone_ui.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dataList = mutableListOf<ProductItem>()
        dataList.add(ProductItem(R.drawable.product, "200,000원", "12월 16일", "애플워치 팝니다.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product2, "80,000원", "12월 16일", "중고카페의자.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product3, "5,000원", "12월 16일", "귀여운 쿼카 파우치!", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product, "200,000원", "12월 29일", "애플워치 팝니다.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product2, "80,000원", "12월 16일", "중고카페의자.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product3, "5,000원", "12월 17일", "귀여운 쿼카 파우치!", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product, "200,000원", "12월 16일", "애플워치 팝니다.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product2, "80,000원", "12월 15일", "중고카페의자.", "서초구 반포2동"))
        dataList.add(ProductItem(R.drawable.product3, "5,000원", "12월 16일", "귀여운 쿼카 파우치!", "서초구 반포2동"))

        binding.productRecycle.adapter = ProductAdapter(dataList)
        binding.productRecycle.layoutManager = LinearLayoutManager(this)

        binding.btnSearch.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        binding.navigation.btnFloating.setOnClickListener{
            val  intent = Intent(this, SelectImageActivity::class.java)
            startActivity(intent)
        }


    }
}