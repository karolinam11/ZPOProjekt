package com.example.maligiganci
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class QuizActivity : AppCompatActivity() {
    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz)
        val et_name: TextView = findViewById(R.id.et_name)
        val btn_start: Button = findViewById(R.id.btn_start)

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()) {

                Toast.makeText(this@QuizActivity, "Wpisz swoje imie", Toast.LENGTH_SHORT)
                    .show()
            } else {

                val intent = Intent(this@QuizActivity, QuizQuestionsActivity::class.java)
                // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
                // START
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                // END
                startActivity(intent)
                finish()
            }
        }
    }
}