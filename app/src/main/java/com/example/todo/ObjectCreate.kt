package com.example.todo
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_create_object.*
class ObjectCreate : AppCompatActivity() {
    private lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_object)
        database = Room.databaseBuilder(
            applicationContext, Database::class.java, "To_Do").build()
        add_button.setOnClickListener {
            if (!add_title.text.toString().trim { it <= ' ' }.isNotEmpty()
            ) {
                var text="Не все поля заполнены!"
                val toast = Toast.makeText(applicationContext,text, Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP or Gravity.CENTER, 0, 0)
                toast.show()
            } else {
                var title = add_title.getText().toString()
                var priority = add_desc.getText().toString()
                DatabaseObject.AddData(title, priority)
                val transition = Intent(this, MainActivity::class.java)
                startActivity(transition)
            }
        }
        close_button.setOnClickListener {
                val transition = Intent(this, MainActivity::class.java)
                startActivity(transition)
        }
    }
}

