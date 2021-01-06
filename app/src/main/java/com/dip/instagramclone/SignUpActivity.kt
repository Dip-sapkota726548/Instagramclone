package com.dip.instagramclone

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.dip.instagramclone.model.signuplogindata

class SignUpActivity : AppCompatActivity() {
    private lateinit var edcoventryid: EditText
    private lateinit var edfirstname: EditText
    private lateinit var edlastname: EditText
    private lateinit var edusername: EditText
    private lateinit var ETPASSWORD: EditText
    private lateinit var batchspinner: Spinner
    private lateinit var btnsignup: Button

    private val Batches = arrayOf("25A", "25B", "25C", "25D", "24A", "25B")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        edcoventryid = findViewById(R.id.edcoventryid)
        edfirstname = findViewById(R.id.edfirstname)
        edlastname = findViewById(R.id.edlastname)
        edusername = findViewById(R.id.edusername)
        ETPASSWORD = findViewById(R.id.ETPSSWORD)
        batchspinner = findViewById(R.id.batchspinner)

        btnsignup = findViewById(R.id.btnsignup)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            Batches
        )
        batchspinner.adapter = adapter

        batchspinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    val selectedItem = parent?.getItemAtPosition(position).toString()
                    Toast.makeText(
                        this@SignUpActivity, "Selected item : $selectedItem", Toast.LENGTH_SHORT
                    ) .show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }
            }


        //intent with other activity

        btnsignup.setOnClickListener {
            var intent = Intent();
            var user = signuplogindata(
                10254839, edfirstname.text.toString(), edlastname.text.toString(), edusername.text.toString(),
                ETPASSWORD.text.toString());

            intent.putExtra("tag", user)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}