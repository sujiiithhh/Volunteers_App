package com.example.volunteers_app.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.volunteers_app.Models.User
import com.example.volunteers_app.R

class MyAdapter : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val userList = ArrayList<User>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.user_item,
            parent,false
        )
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val currentitem = userList[position]

        holder.Contact.text = currentitem.Contact
        holder.Date.text = currentitem.Date
        holder.Location.text = currentitem.Location
        holder.Name.text = currentitem.Name

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    fun updateUserList(userList : List<User>){

        this.userList.clear()
        this.userList.addAll(userList)
        notifyDataSetChanged()

    }

    class  MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        val Contact : TextView = itemView.findViewById(R.id.tvcontact)
        val Date : TextView = itemView.findViewById(R.id.tvdate)
        val Location : TextView = itemView.findViewById(R.id.tvlocation)
        val Name : TextView = itemView.findViewById(R.id.tvorganisation)

    }

}