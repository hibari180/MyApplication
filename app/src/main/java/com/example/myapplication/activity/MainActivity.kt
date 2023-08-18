package com.example.myapplication.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.viewbinding.ViewBinding
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mBinding = ActivityMainBinding.inflate(layoutInflater)
        mBinding.btnRecycleViewLinear.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        Log.i("test",p0.toString())
        if(p0!=null){
            when (p0.id) {
                R.id.btn_recycle_view_linear->{
                    var intent = Intent(this,wananzhuoActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}