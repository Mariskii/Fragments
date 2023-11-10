package com.example.fragmentejercicio

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


private const val ARG_PARAM1 = "nombre"



class Fragment1 : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var input:com.google.android.material.textfield.TextInputEditText
    private lateinit var boton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }

    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        input = view.findViewById(R.id.input_nombre)
        boton = view.findViewById(R.id.botonResultado)

        boton.setOnClickListener {
            val data = input.text.toString()

            val fragment2 = BlankFragment2()
            val bundle = Bundle()
            bundle.putString("nombre", data)
            fragment2.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment1, fragment2)
                .addToBackStack(null)
                .commit()
        }

        return view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, input.text.toString())
                }
            }
    }

}