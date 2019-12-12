package com.example.radiobuttondemo

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        program.setOnCheckedChangeListener(mOnCheckedChangeListener)
        ui.setOnCheckedChangeListener(mOnCheckedChangeListener)
    }
    private val mOnCheckedChangeListener = CompoundButton.OnCheckedChangeListener { buttonView, _ ->
        when(buttonView.id){
            R.id.program -> Toast.makeText(this@MainActivity, "安安, 程式設計師!", Toast.LENGTH_SHORT).show()
            R.id.ui->Toast.makeText(this@MainActivity, "安安, UI設計師!", Toast.LENGTH_SHORT).show()
        }
    }
}
