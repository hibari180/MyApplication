package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        var mBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)
        mBinding.btnRecycleViewLinear.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var intent = Intent(this, wananzhuoActivity::class.java)
        startActivity(intent)
    }
}