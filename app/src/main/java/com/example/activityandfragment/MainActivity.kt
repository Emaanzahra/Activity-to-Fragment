package com.example.activityandfragment

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityandfragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val fragment = NewFragment()
            val name = binding.editTextText.text.toString()
            val bundle = Bundle()
            bundle.putString("name", name)
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction().add(R.id.framecontainer, fragment)
                .addToBackStack(null).commit()
        }
    }
}