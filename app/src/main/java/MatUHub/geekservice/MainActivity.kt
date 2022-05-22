package MatUHub.geekservice

import MatUHub.geekservice.databinding.ActivityMainBinding
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startServiceButton.setOnClickListener {
            val intent = ToastService.getLaunchIntent(this, "Kotlin")
            startService(intent)
        }

        binding.stopServiceButton.setOnClickListener {
            stopService(intent)
        }
    }
}