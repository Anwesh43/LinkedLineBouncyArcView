package com.anwesh.uiprojects.linkedlinebouncyarcview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.linebouncyarcview.LineBouncyArcView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LineBouncyArcView.create(this)
    }
}
