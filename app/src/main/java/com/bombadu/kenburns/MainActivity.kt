package com.bombadu.kenburns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.flaviofaria.kenburnsview.KenBurnsView
import com.flaviofaria.kenburnsview.Transition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var kbv: KenBurnsView
    private var moving = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false


        kbv = findViewById(R.id.kbv)

        kbv.setOnClickListener {
            if (moving) {
                kbv.pause()
                moving = false
            } else {
                kbv.resume()
                moving = true
            }
        }


    }
}