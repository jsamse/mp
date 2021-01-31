package se.jsam.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import se.jsam.mp.DeviceInfoService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val service = DeviceInfoService()
        service.getDeviceInfo {
            findViewById<TextView>(R.id.text).text = it.toString()
        }
    }
}