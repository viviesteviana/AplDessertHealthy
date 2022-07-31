package com.vivie.apldesserthealthy

import android.os.Build.ID
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailActivity : AppCompatActivity() {
    companion object {
        const val TITLE = "detailTitle"
        const val DESC = "detailDesc"
        const val PEMBUATAN = "detailPembuatan"
        const val IMG = "detailImg"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvTitle: TextView = findViewById(R.id.detailTitle)
        val tvDesc: TextView = findViewById(R.id.detailDesc)
        val tvPembuatan :TextView = findViewById(R.id.detailPembuatan)
        val tvImg: ImageView = findViewById(R.id.detailImg)


        val dTitle = intent.getStringExtra(TITLE)
        val dDesc = intent.getStringExtra(DESC)
        val dPembuatan = intent.getStringExtra(PEMBUATAN)
        val dImg = intent.getIntExtra(IMG, 0)

        tvTitle.text = dTitle
        tvDesc.text = dDesc
        tvPembuatan.text = dPembuatan


        Glide.with(this)
            .load(dImg)
            .apply(RequestOptions())
            .into(tvImg)
    }
}


