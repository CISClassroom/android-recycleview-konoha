package com.cis.recycleviewapplication

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//< t > t is Type
class UserAdapter(val userList: ArrayList<User>):
    RecyclerView.Adapter<UserAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.count()
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        holder.bindItem(userList[position].name,userList[position].title)
    }

    class ViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

            //adtribute
            val textName = itemView.findViewById<TextView>(R.id.textName)
            val texrTitle = itemView.findViewById<TextView>(R.id.textTitle)

            fun bindItem(name: String, title: String) {
                textName.text = name
                texrTitle.text = title
            }

            override fun onClick(v: View) {
                Log.d("onClick", textName.text.toString() + " click")
            }
        }
    }