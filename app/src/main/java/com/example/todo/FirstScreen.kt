package com.example.todo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.room.Room
class FirstScreen : AppCompatActivity() {
    private lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(applicationContext, Database::class.java, "To_Do").build()
        Handler(Looper.getMainLooper()).postDelayed({
            val transition = Intent(this, MainActivity::class.java)
            startActivity(transition)
        }, 2000)
    }
}