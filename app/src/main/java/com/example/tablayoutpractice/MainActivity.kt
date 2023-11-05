package com.example.tablayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TableRow
import android.widget.TextView
import androidx.core.view.setPadding
import com.example.tablayoutpractice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun addEntry(view:View) {
        val tableRow = TableRow(this)

        val layoutParams = TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT)
        tableRow.layoutParams = layoutParams
        tableRow.setPadding(20)

        val tvAndroidVersion = TextView(this)
        val tvAndroidCodeName = TextView(this)
        tvAndroidVersion.text = binding.etAndroidVersion.text
        tvAndroidCodeName.text = binding.etAndroidCodeName.text
        tvAndroidVersion.setBackgroundColor(resources.getColor(R.color.pink))
        tvAndroidCodeName.setBackgroundColor(resources.getColor(R.color.pink))
        tableRow.addView(tvAndroidVersion,0)
        tableRow.addView(tvAndroidCodeName,1)

        binding.tableLayoutid.addView(tableRow)

        binding.etAndroidCodeName.text.clear()
        binding.etAndroidVersion.text.clear()
    }
}