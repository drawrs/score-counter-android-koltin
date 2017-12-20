package com.khilman.www.iakcirebon2017

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_counter.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // dapatkan nilai dari Intent
        val nameTeamA = intent.getStringExtra("NM_A")
        val nameTeamB = intent.getStringExtra("NM_B")
        // dapatkan score
        val scoreTeamA = intent.getIntExtra("SC_A", 0)
        val scoreTeamB = intent.getIntExtra("SC_B", 0)


        var matchResult : String ?
        // Cari pemenang
        if (scoreTeamA > scoreTeamB){
            matchResult = nameTeamA
        } else if (scoreTeamA < scoreTeamB ){
            matchResult = nameTeamB
        } else {
            matchResult = "...DRAW..."
        }

        // Set Text ke widget
        tvMatchResult.text = matchResult
        //tvNameTeamA.text = "w"
        tvNameTeamB.text = "$nameTeamB : $scoreTeamB"
    }
}
