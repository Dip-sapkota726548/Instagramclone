package com.dip.instagramclone.model

import java.io.Serializable

data class signuplogindata(
    var coventryId: Int? = null,
    var fName:String? = null,
    var lname:String? = null,
    var username:String? = null,
    var password:String? = null,
    var batchname:String? = null,
    var profilepicture:String? = null

): Serializable{

}