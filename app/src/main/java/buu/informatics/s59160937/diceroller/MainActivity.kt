package buu.informatics.s59160937.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button: Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener{ rollDice() }


    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randonInt = Random().nextInt(6) + 1




        val result_text: TextView = findViewById(R.id.result_text)
        result_text.text = randonInt.toString()
    }
}
