package com.example.module_2_lesson_6_hw_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_patient.view.*

class PatientsAdapter(val patients: ArrayList<Patient>, val context: Context,
                      val callback: PatientListCallback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_patient,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = "${patients[position].name} ${patients[position].lastName}"
        holder.avatar.setImageBitmap(patients[position].avatar)
        holder.root.setOnClickListener {
            callback.onItemSelected(patients[position])
        }
    }

    override fun getItemCount(): Int {
        return patients.size
    }
}

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val name = itemView.tvPatient
    val root = itemView.clPatientRoot
    val avatar = itemView.ivPatientAvatar
}

interface PatientListCallback{
    fun onItemSelected(item: Patient)
}