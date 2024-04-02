package dev.nermingules.firebasenotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.nermingules.firebasenotification.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.tvDeger.text = intent.getStringExtra("deger")

    }

}