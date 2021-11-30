package com.group5.techtut

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tutorial2.*

class TutorialActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial3)

        task1.setOnClickListener{
            val pdfName = "settingUpUPI.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task2.setOnClickListener{
            val pdfName = "DoubleInstanceApp.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task3.setOnClickListener{
            val pdfName = "DigiLocker.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task4.setOnClickListener{
            val pdfName = "TurnOffAdsYouTube.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task5.setOnClickListener{
            val pdfName = "BackupPhoto.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task6.setOnClickListener{
            val pdfName = "OrderFoodOnline.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task7.setOnClickListener{
            val pdfName = "ManageStorage.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }
        task8.setOnClickListener{
            val pdfName = "InstallAntiVirus.pdf"
            val intent = Intent(this,ManualActivity::class.java)
            intent.putExtra("key",pdfName)
            startActivity(intent)
        }


        prevBtn.setOnClickListener {
            val intent = Intent(this, TutorialActivity2::class.java)
            startActivity(intent)
        }
    }
}