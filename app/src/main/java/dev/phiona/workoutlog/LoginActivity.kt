package dev.phiona.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignUp: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tvSignUp=findViewById(R.id.tvSignup)
        tvSignUp.setOnClickListener{
            val  intent=Intent(this,SignupActivity::class.java)
            startActivity(intent)

        }
    }
}