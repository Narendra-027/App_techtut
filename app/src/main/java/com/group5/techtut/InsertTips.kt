package com.group5.techtut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_tips.*

class InsertTips : AppCompatActivity() {
    var i=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tips)

        var database = FirebaseDatabase.getInstance().reference

        sendTip.setOnClickListener{
            var inputTip = boxTip.text.toString()
            database.child("Tips/$i").setValue(inputTip).addOnSuccessListener {
                boxTip.text.clear()
                i += 1
            }
        }

    }
}