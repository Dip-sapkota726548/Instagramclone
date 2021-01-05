package com.dip.instagramclone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.signuplogindata

class LoginActivity : AppCompatActivity() {
    private lateinit var edusername: EditText
    private lateinit var edpassword : EditText
    private lateinit var btnlogin: Button
    private lateinit var Tvsignup: TextView

    private var lstlogin= ArrayList<signuplogindata>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lstlogin  = arrayListOf<signuplogindata>()

        edusername = findViewById(R.id.edusername)
        edpassword = findViewById(R.id.edpassword)
        btnlogin = findViewById(R.id.btnlogin)
        Tvsignup = findViewById(R.id.Tvsignup)


        Tvsignup.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {

                val intent = Intent(this@LoginActivity, SignUpActivity::class.java)

                startActivity(intent)
            }
        })


        //maindashboard open

        btnlogin.setOnClickListener {
            for(i in lstlogin){
                if(edusername.text.toString() == i.username && edpassword.text.toString() ==i.password) {

                    val intent = Intent(this@LoginActivity, InstagramDashboard::class.java)
                    startActivity(intent)
                    //return@setOnClickListener
                }
            }
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==1){
            if(resultCode== Activity.RESULT_OK){
//                var tvname=data?.getSerializableExtra("name") as instagram
//                var tvpassword=data?.getSerializableExtra("password") as instagram
//                var mobile=data?.getSerializableExtra("mobile") as Person
//                var gender=data?.getSerializableExtra("gender") as Person
                var address = data?.getSerializableExtra("abc") as signuplogindata
//                lstActors.add(tvname)
//                lstActors.add(tvpassword)
                lstlogin.add(address)

//                                recyclerView.add(address)
            }


        }
    }

//        btnlogin.setOnClickListener(object: View.OnClickListener{
//            override fun onClick(v: View?) {
//
//                val intent = Intent(this@LoginActivity, InstagramDashboard::class.java)
//                startActivity(intent)
//            }
//        })
    }
