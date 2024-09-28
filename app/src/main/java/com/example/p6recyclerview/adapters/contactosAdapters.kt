package com.example.p6recyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.DecorContentParent
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.p6recyclerview.R

class contactosAdapters (private val context: Context, private val contactos: Array<String>): RecyclerView.Adapter<contactosAdapters.ViewHolder>(){

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
    val textView: TextView
    val cardView: CardView

        init {
            textView = view.findViewById(R.id.textView2)
            cardView = view.findViewById(R.id.cardViewContactos)
        }
    }

    override  fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_view, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = contactos.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        val persona = contactos[position]
        holder.textView.text = persona

        holder.cardView.setOnClickListener{
            Toast.makeText(context, "Contacto seleccionado ($persona)", Toast.LENGTH_LONG).show()
        }
    }
}