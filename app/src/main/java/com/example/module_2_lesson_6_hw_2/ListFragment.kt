package com.example.module_2_lesson_6_hw_2

import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvPatients.adapter = PatientsAdapter(getPatients(), requireContext())
        rvPatients.layoutManager = LinearLayoutManager(requireContext())
    }

    fun getPatients(): ArrayList<Patient>{

        val patients = ArrayList<Patient>()

        patients.add(Patient("Ivan","Kozak",62,"Description of patient is very long text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_1), "Male", "Medical history of Ivan Kozak."))
        patients.add(Patient("Mykola","Kozak",33,"Description of patient is medium text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_2), "Male", "Medical history of Mykola Kozak."))
        patients.add(Patient("Illia","Kozak",26,"Description of patient is short text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_3), "Male", "Medical history of Illia Kozak."))
        patients.add(Patient("Tima","Kozak",7,"Description of patient: still growing.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_4), "Male", "Medical history of Tima Kozak."))
        patients.add(Patient("Mykyta","Kozak",1,"Description of patient: in the start of his way.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_5), "Male", "Medical history of Mykyta Kozak."))
        patients.add(Patient("Ivan","Kozak",62,"Description of patient is very long text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_1), "Male", "Medical history of Ivan Kozak."))
        patients.add(Patient("Mykola","Kozak",33,"Description of patient is medium text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_2), "Male", "Medical history of Mykola Kozak."))
        patients.add(Patient("Illia","Kozak",26,"Description of patient is short text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_3), "Male", "Medical history of Illia Kozak."))
        patients.add(Patient("Tima","Kozak",7,"Description of patient: still growing.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_4), "Male", "Medical history of Tima Kozak."))
        patients.add(Patient("Mykyta","Kozak",1,"Description of patient: in the start of his way.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_5), "Male", "Medical history of Mykyta Kozak."))
        patients.add(Patient("Ivan","Kozak",62,"Description of patient is very long text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_1), "Male", "Medical history of Ivan Kozak."))
        patients.add(Patient("Mykola","Kozak",33,"Description of patient is medium text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_2), "Male", "Medical history of Mykola Kozak."))
        patients.add(Patient("Illia","Kozak",26,"Description of patient is short text.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_3), "Male", "Medical history of Illia Kozak."))
        patients.add(Patient("Tima","Kozak",7,"Description of patient: still growing.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_4), "Male", "Medical history of Tima Kozak."))
        patients.add(Patient("Mykyta","Kozak",1,"Description of patient: in the start of his way.",
            BitmapFactory.decodeResource(resources, R.drawable.friends_5), "Male", "Medical history of Mykyta Kozak."))

        return patients
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ListFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ListFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}