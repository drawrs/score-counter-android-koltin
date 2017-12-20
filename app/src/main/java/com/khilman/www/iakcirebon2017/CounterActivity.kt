package com.khilman.www.iakcirebon2017

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)

        // Dapatkan data yang dibawa oleh Intent
        val nameTeamA = intent.getStringExtra("nm_a")
        val nameTeamB = intent.getStringExtra("nm_b")


        // set Nilai variable ke TextView
        tvNameTeamA.text = nameTeamA
        tvNameTeamB.text = nameTeamB

        // beri Even klik pada button
        btnAddScoreA.setOnClickListener {
            // perintah yg akani jalankan
            // dapatkan nilai terakhir
            val score_terakhir : Int = tvScoreA.text.toString().toInt()

            // tambahkan nilai dengan + 1
            val score_baru : Int = score_terakhir + 1

            // set nilai ke widget
            tvScoreA.text = score_baru.toString()
        }
        // beri Even klik pada button
        btnAddScoreB.setOnClickListener {
            // perintah yg akani jalankan
            // dapatkan nilai terakhir
            val score_terakhir : Int = tvScoreB.text.toString().toInt()

            // tambahkan nilai dengan + 1
            val score_baru : Int = score_terakhir + 1

            // set nilai ke widget
            tvScoreB.text = score_baru.toString()
        }
    }

    fun finishMatch(view : View){
        // Tampilkan toast
        //Toast.makeText(this, "Finish di tekan", Toast.LENGTH_LONG).show()

        // get nama tim
        val nameTeamA = tvNameTeamA.text.toString()
        val nameTeamB = tvNameTeamB.text.toString()
        /// get score tim
        val scoreTeamA = tvScoreA.text.toString().toInt()
        val scoreTeamB = tvScoreB.text.toString().toInt()

        // panggil class Intent
        var intent : Intent = Intent(this, ResultActivity::class.java)
        // sisipkan data ke Intent
        intent.putExtra("NM_A", nameTeamA)
        intent.putExtra("NM_B", nameTeamB)

        intent.putExtra("SC_A", scoreTeamA)
        intent.putExtra("SC_B", scoreTeamB)


        // mulai activity baru
        startActivity(intent)
    }


}
