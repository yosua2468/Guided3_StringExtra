package com.example.guided3_stringextra


import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import com.google.android.material.textfield.TextInputEditText
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    private lateinit var getAngka : TextInputEditText
    private var btnRGrup : RadioGroup? = null
    private lateinit var btnRButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val intent = Intent(this, DisplayMessage::class.java)
        val message: String
        btnRGrup = findViewById(R.id.radioGroup)
        val rbc: Int = btnRGrup!!.checkedRadioButtonId
        btnRButton = findViewById(rbc)
        message = btnRButton.text.toString()

        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

        fun sendNumberMessage(view: View){
            val intent = Intent(this, DisplayNumber::class.java)
            getAngka = findViewById(R.id.tietKetikAngka)
            val angka:Int = (getAngka.text.toString()).toInt()

            intent.putExtra("inputanAngka", angka.toString())
            startActivity(intent)
        }

        companion object {
            const val EXTRA_MESSAGE = "MESSAGE"
        }

}