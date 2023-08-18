package com.example.myapplication.model

import android.content.Context
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
        var br1 = BufferedReader(InputStreamReader(context.resources.assets.open("json")))
        var line: String?
        val sb = StringBuilder()
        while (br1.readLine().also { line = it } != null) {
            sb.append(line)
        }
        br1.close()
        var jsonStringOb = sb.toString()
        var br2 = BufferedReader(InputStreamReader(context.resources.assets.open("json1")))
        while (br2.readLine().also { line = it } != null) {
            sb.append(line)
        }
        br2.close()
        var jsonStringAr = sb.toString()

        var jsonObject = JSONObject(jsonStringOb)
        var projectClassification = ProjectClassification()
        var jsonArray = jsonObject.getJSONArray("articleList")
        projectClassification.articleList = jsonArray.toString()
        projectClassification.author = jsonObject.getString("author")
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
        println(projectClassification.toString())
    }
}