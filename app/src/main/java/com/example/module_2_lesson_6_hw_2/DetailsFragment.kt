package com.example.module_2_lesson_6_hw_2

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_details.*
import kotlinx.android.synthetic.main.item_patient.*

class DetailsFragment : Fragment() {
    private var patient: Patient? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvName.text = patient?.name
        tvLastName.text = patient?.lastName
        tvAge.text = patient?.age.toString()
        tvDescription.text = patient?.description
        ivAvatar.setImageBitmap(patient?.avatar)
        tvSex.text = patient?.sex
        tvMedicalHistory.text = patient?.medicalHistory

    }

    companion object {
        @JvmStatic
        fun newInstance(patient: Patient) =
            DetailsFragment().apply {
                this.patient = patient
            }
    }
}