package com.vivie.apldesserthealthy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvDessert: RecyclerView
    private var list: ArrayList<ModelDessert> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDessert = findViewById(R.id.listview)
        rvDessert.setHasFixedSize(true)

        list.addAll(DessertData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvDessert.layoutManager = LinearLayoutManager(this)
        val myAdapter = MyAdapter(list)
        rvDessert.adapter = myAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedModel: Int) {
        when (selectedModel) {
            R.id.about_menu -> {
                val about = Intent(
                    this@MainActivity,
                    AboutActivity::class.java
                )
                startActivity(about)
            }
        }
    }


}

