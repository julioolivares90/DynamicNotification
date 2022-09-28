package com.julioolivfares90.DynamicNotification.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.julioolivfares90.DynamicNotification.NotificationModel
import com.julioolivfares90.DynamicNotification.R

class AdapterNotifications(private val notifications : MutableList<NotificationModel>) : RecyclerView.Adapter<NotificacionHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificacionHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return NotificacionHolder(layoutInflater.inflate(R.layout.row_notifications,parent,false))
    }

    override fun onBindViewHolder(holder: NotificacionHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return notifications.size
    }

}

class NotificacionHolder(val view: View) : RecyclerView.ViewHolder(view) {

    var title = view.findViewById<TextView>(R.id.textView)
    var foto = view.findViewById<ImageView>(R.id.imageView2)
    fun binding(notification : NotificationModel){

    }
}
