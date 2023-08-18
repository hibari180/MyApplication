package com.example.myapplication.entity

/**
 * Project classification
 * 项目分类
 *
 * @property articleList  文章列表
 * @property author  作者
 * @property children  该分类下的项目
 * @property courseId
 * @property cover
 * @property desc
 * @property id  id在获取该分类下的项目目录中使用
 * @property lisense
 * @property lisenseLink
 * @property name  分类名称
 * @property order
 * @property parentChapterId
 * @property type
 * @property userControlSetTop
 * @property visible
 * @constructor Create empty Project classification
 */
data class ProjectClassification(
    var articleList: String? = "",
    var author: String? = "",
    var children: List<Int>? = null,
    var courseId: Int = 0,
    var cover: String? = "",
    var desc: String = "",
    var id: Int = 0,
    var lisense: String? = "",
    var lisenseLink: String? = "",
    var name: String = "",
    var order:Int=0,
    var parentChapterId:Int = 0,
    var type:Int = 0,
    var userControlSetTop:Boolean = false,
    var visible:Int = 0
)
