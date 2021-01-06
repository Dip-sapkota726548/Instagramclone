package com.dip.instagramclone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide
import com.dip.instagramclone.model.Instagram
import com.dip.instagramclone.model.signuplogindata

class LoginActivity : AppCompatActivity() {
    private lateinit var edusername: EditText
    private lateinit var edpassword : EditText
    private lateinit var btnlogin: Button
    private lateinit var Tvsignup: TextView

    private var lstlogin= ArrayList<signuplogindata>()

    var username = "dipsapkota325@gmail.com"
    var password = "admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

      lstlogin  = arrayListOf<signuplogindata>()
        //lstusers = ArrayList()
        edusername = findViewById(R.id.edusername)
        edpassword = findViewById(R.id.edpassword)
        btnlogin = findViewById(R.id.btnlogin)
        Tvsignup = findViewById(R.id.Tvsignup)


        loadUser()
        btnlogin.setOnClickListener {
            var inputName = edusername.text.toString()
            var inputPassword = edpassword.text.toString()
            val intent= Intent(this,MainActivity::class.java)
            if (inputName.isEmpty() || inputPassword.isEmpty()) {
                Toast.makeText(this, "Fields can't be empty..", Toast.LENGTH_SHORT).show()
            } else {
                if (inputName.equals(username) && inputPassword.equals(password))
                    startActivity(intent)
                else {
                    var status = "Log In Fail"
                    Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
                }
            }
        }
        Tvsignup.setOnClickListener {
            startActivity(Intent(this,SignUpActivity::class.java))
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== Activity.RESULT_OK){
            var users = data?.getSerializableExtra("tag") as signuplogindata
            lstlogin.add(users)
        }
    }
    private fun loadUser() {
        lstlogin.add(signuplogindata(10254839,"Dip","Sapkota","dipsapkota325@gmail.com","admin"))
    }
}