package com.cis.recycleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearLayout = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val gridLayout = GridLayoutManager(this,2)

        recyclerView.layoutManager =linearLayout

        val user = ArrayList<User>()
        user.add(User("Mickey","Mr."))
        user.add(User("Mickey","Mr."))
        user.add(User("Mickey","Mr."))
        user.add(User("Mickey","Mr."))
        user.add(User("Mickey","Mr."))

        var adapter = UserAdapter(user)
        recyclerView.adapter = adapter

    }
}
