package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.model.WananzhuoModel

class wananzhuoActivity : AppCompatActivity() {

    private val viewModel: WananzhuoModel = ViewModelProvider(
        this)[WananzhuoModel::class.java]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wananzhuo)

    }

    init {
        viewModel.getFakeData(this)
    }
}