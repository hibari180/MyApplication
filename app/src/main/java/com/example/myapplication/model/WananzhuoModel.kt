package com.example.myapplication.model

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.entity.ProjectClassification
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import org.json.JSONArray
import org.json.JSONObject
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

class WananzhuoModel : ViewModel() {

    private val mData: MutableLiveData<ProjectClassification> = MutableLiveData()

    fun getData() = mData

    fun fetchWananzhuoApi() {

    }

    /**
     * 获取列表假数据
     *
     */
    fun getFakeData(context: Context) {
        var br1 = BufferedReader(InputStreamReader(context.resources.assets.open("json.json")))
        var line: String?
        val sb1 = StringBuilder()
        while (br1.readLine().also { line = it } != null) {
            sb1.append(line)
        }
        br1.close()
        var jsonStringAr = sb1.toString()

        var jsonObject = JSONObject(jsonStringAr)
        var projectClassification = ProjectClassification()
        projectClassification.author = jsonObject.getString("author")
        var jsonArray = jsonObject.getJSONArray("articleList")
        var list1: MutableList<Int>? = mutableListOf()
        if (jsonArray != null) {
            var index = 0
            while (index < jsonArray.length()) {
                list1!!.add(jsonArray.getInt(index))
            }
        } else list1 = null
        projectClassification.articleList = list1
        projectClassification.id = jsonObject.getInt("id")
        projectClassification.cover = jsonObject.getString("cover")
        projectClassification.desc = jsonObject.getString("desc")
        var jsonArray1 = jsonObject.getJSONArray("children")
        var list: MutableList<Int>? = mutableListOf()
        if (jsonArray1 != null) {
            var index = 0
            while (index < jsonArray1.length()) {
                list!!.add(jsonArray1.getInt(index))
            }
        } else list = null
        projectClassification.children = list
        projectClassification.courseId = jsonObject.getInt("courseId")
        projectClassification.lisense = jsonObject.getString("lisense")
        projectClassification.lisenseLink = jsonObject.getString("lisenseLink")
        projectClassification.name = jsonObject.getString("name")
        projectClassification.order = jsonObject.getInt("order")
        projectClassification.parentChapterId = jsonObject.getInt("parentChapterId")
        projectClassification.type = jsonObject.getInt("type")
        projectClassification.userControlSetTop = jsonObject.getBoolean("userControlSetTop")
        projectClassification.visible = jsonObject.getInt("visible")
        Log.i("test",projectClassification.toString())
    }
}