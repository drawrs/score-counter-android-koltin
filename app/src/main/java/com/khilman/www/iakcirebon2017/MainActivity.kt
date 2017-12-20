package com.khilman.www.iakcirebon2017

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Beri event klik pada tombol Start Match
        btnStartMatch.setOnClickListener {
            // Perintah yg akan di jalankan

            // Dapatkan nilai dari EditText lalu tampung dlm variable
            val nameTeamA : String = etTeamAName.text.toString()
            val nameTeamB : String = etTeamBName.text.toString()

            // panggil clas Intent
            var intent = Intent(this, CounterActivity::class.java)
            // Sisipkan data ke Intent
            intent.putExtra("nm_a", nameTeamA)
            intent.putExtra("nm_b", nameTeamB)
            // Mulai Activity baru
            startActivity(intent)
        }
    }
}
