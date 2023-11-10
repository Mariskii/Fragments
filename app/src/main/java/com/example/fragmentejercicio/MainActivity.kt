package com.example.fragmentejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import com.example.fragmentejercicio.BlankFragment2.Companion.ARG_PARAM1

private lateinit var fragment1: Fragment1
private lateinit var fragment2: BlankFragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragment1 = Fragment1()
        fragment2 = BlankFragment2()


    }
}