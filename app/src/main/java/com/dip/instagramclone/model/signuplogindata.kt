package com.dip.instagramclone.model

import java.io.Serializable

data class signuplogindata(
    val username:String?=null,
    val password:String?=null,
    val coventryId: String? =null,
    val fName:String?=null,
    val lname:String?=null,
    val batchname:String?=null,
    val profilepicture:String?=null

): Serializable{

}