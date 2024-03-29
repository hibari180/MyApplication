package com.example.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityWananzhuoBinding
import com.example.myapplication.model.WananzhuoModel

class wananzhuoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var mBinding = ActivityWananzhuoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        initdata()
    }

    fun initdata(){
        val viewModel: WananzhuoModel = ViewModelProvider(
            this)[WananzhuoModel::class.java]
        var pro = viewModel.getFakeData(this)
        Toast.makeText(this,pro.toString(),Toast.LENGTH_SHORT)
    }
}