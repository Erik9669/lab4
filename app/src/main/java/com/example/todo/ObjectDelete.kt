package com.example.todo
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_delete_object.*
import kotlinx.android.synthetic.main.activity_delete_object.add_desc
import kotlinx.android.synthetic.main.activity_delete_object.add_title
class ObjectDelete : AppCompatActivity() {
    private lateinit var database: Database
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_object)
        database = Room.databaseBuilder(applicationContext, Database::class.java, "To_Do").build()
        val position = this.intent.getIntExtra("id", -1)
        when {
            position == -1 -> return
            else -> {
                val title = DatabaseObject.getshowData(position).title
                val priority = DatabaseObject.getshowData(position).priority
                add_title.setText(title)
                add_desc.setText(priority)
                close_button1.setOnClickListener {
                    val transition = Intent(this , MainActivity::class.java)
                    startActivity(transition)
                }
                complete_button.setOnClickListener {
                    DatabaseObject.completeData(position)
                    myIntent()
                }
            }
        }
    }
    fun myIntent() {
        val intent = Intent(this, MainActivity::class.java)
        class MyDialogFragment : DialogFragment() {
            override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
                return activity?.let {
                    val builder = AlertDialog.Builder(it)
                    builder.setMessage("Задача выполнена!")
                        .setPositiveButton("ОК") {
                                dialog, id ->  dialog.cancel()
                            startActivity(intent)
                        }
                    builder.create()
                } ?: throw IllegalStateException("Ошибка!!!")
            }
        }
        val myDialogFragment = MyDialogFragment()
        val manager = supportFragmentManager
        myDialogFragment.show(manager, "myDialog")
    }
}