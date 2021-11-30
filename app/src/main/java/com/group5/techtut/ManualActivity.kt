package com.group5.techtut

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.barteksc.pdfviewer.PDFView

class ManualActivity:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manual)

        val pdfView  = findViewById<PDFView>(R.id.pdfview)
        var bundle :Bundle ?=intent.extras
        var fileName = bundle!!.getString("key")
        pdfView.fromAsset(fileName).load()

    }


}