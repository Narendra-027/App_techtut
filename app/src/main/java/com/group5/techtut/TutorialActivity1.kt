package com.group5.techtut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tutorial1.*

class TutorialActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial1)

        task1.setOnClickListener{
            val pdfName = "Hotspot.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task2.setOnClickListener{
            val pdfName = "flashlight.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task3.setOnClickListener{
            val pdfName = "brightness.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task4.setOnClickListener{
            val pdfName = "alarm.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task5.setOnClickListener{
            val pdfName = "videocall.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task6.setOnClickListener{
            val pdfName = "game.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task7.setOnClickListener{
            val pdfName = "photo.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task8.setOnClickListener{
            val pdfName = "google.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        nextBtn.setOnClickListener {
            val intent = Intent(this,TutorialActivity2::class.java)
            startActivity(intent)
        }
    }
}