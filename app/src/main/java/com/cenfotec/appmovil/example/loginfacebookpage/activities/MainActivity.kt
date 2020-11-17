package com.cenfotec.appmovil.example.loginfacebookpage.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cenfotec.appmovil.example.loginfacebookpage.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        titleTextView.setText("Manu")
    }

}

