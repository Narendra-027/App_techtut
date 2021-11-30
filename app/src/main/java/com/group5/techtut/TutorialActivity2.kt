package com.group5.techtut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tutorial1.*
import kotlinx.android.synthetic.main.activity_tutorial2.*
import kotlinx.android.synthetic.main.activity_tutorial2.nextBtn
import kotlinx.android.synthetic.main.activity_tutorial2.task1
import kotlinx.android.synthetic.main.activity_tutorial2.task2
import kotlinx.android.synthetic.main.activity_tutorial2.task3
import kotlinx.android.synthetic.main.activity_tutorial2.task4
import kotlinx.android.synthetic.main.activity_tutorial2.task5
import kotlinx.android.synthetic.main.activity_tutorial2.task6
import kotlinx.android.synthetic.main.activity_tutorial2.task7
import kotlinx.android.synthetic.main.activity_tutorial2.task8

class TutorialActivity2  : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial2)

        task1.setOnClickListener{
            val pdfName = "enlargeKB.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task2.setOnClickListener{
            val pdfName = "Increasetextsize.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task3.setOnClickListener{
            val pdfName = "uninstallapps.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task4.setOnClickListener{
            val pdfName = "TurnOffGesture.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task5.setOnClickListener{
            val pdfName = "SettingUpBiometric.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task6.setOnClickListener{
            val pdfName = "CreatingPDF.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task7.setOnClickListener{
            val pdfName = "ChangeRingtone.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task8.setOnClickListener{
            val pdfName = "ChangeWallpaper.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }

        prevBtn.setOnClickListener {
            val intent = Intent(this,TutorialActivity1::class.java)
            startActivity(intent)
        }
        nextBtn.setOnClickListener {
            val intent = Intent(this,TutorialActivity3::class.java)
            startActivity(intent)
        }
    }
}