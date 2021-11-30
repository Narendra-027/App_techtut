package com.group5.techtut

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.transition.Slide
import android.widget.Button
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_home.*
import android.transition.TransitionManager
import android.util.Log
import android.view.Gravity
import android.view.View
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_about.view.*


class HomeActivity:AppCompatActivity(){
    private var flag = true
    lateinit var ref:DatabaseReference
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var database = FirebaseDatabase.getInstance().reference

            val i = (1..10).random()
            database.child("Tips/$i").get().addOnSuccessListener {
                Log.i("firebase", "Got value ${it.value}")
                tipText.text = "Today's Tip\n\n"+it.value.toString()
            }.addOnFailureListener{
                Log.e("firebase", "Error getting data", it)
            }
        val j = (1..24).random()
        database.child("Tasks/$j").get().addOnSuccessListener {
            Log.i("firebase", "Got value ${it.value}")
            taskText.text = "Today's Task\n"+it.value.toString()
        }.addOnFailureListener{
            Log.e("firebase", "Error getting data", it)
        }
        /////////////////////////////////////////////////////////////////////////
        about.setOnClickListener {
            if (flag) {
                val window = PopupWindow(this)
                val view = layoutInflater.inflate(R.layout.activity_about, null)
                window.contentView = view

                val close = view.findViewById<Button>(R.id.close)
                close.setOnClickListener {
                    window.dismiss()
                    flag = true
                }
                window.elevation = 10.0F

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    // Create a new slide animation for popup window enter transition
                    val slideIn = Slide()
                    slideIn.slideEdge = Gravity.TOP
                    window.enterTransition = slideIn

                    // Slide animation for popup window exit transition
                    val slideOut = Slide()
                    slideOut.slideEdge = Gravity.END
                    window.exitTransition = slideOut

                }
                TransitionManager.beginDelayedTransition(root_layout)
                window.showAtLocation(root_layout, Gravity.CENTER, 0, 0)
                readAbout(view)
                flag = false
            }
        }
        ////////////////////////////////////////////////////////////////////////////
        tutorialBtn.setOnClickListener {
            val intent = Intent(this,TutorialActivity1::class.java)
            startActivity(intent)
        }
        manualBtn.setOnClickListener {
            val pdfName = "TutorialManual.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }

    }

    @SuppressLint("SetTextI18n")
    private fun readAbout(view: View) {
                view.textView.text = "TechTUT is your personal guide to get an idea of how to use your phone.\n" +
                        "Having Trouble using phones?\n" +
                        "Worry not, as we try to intimate you with the interface using daily tasks, a notifications centre and an archive of all tasks."
            }
}