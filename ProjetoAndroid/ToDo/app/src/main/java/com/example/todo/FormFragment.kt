package com.example.todo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.DatePicker
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.todo.databinding.FragmentFormBinding
import com.example.todo.fragment.DatePickerFragment
import com.example.todo.fragment.TimerPickerListener
import com.example.todo.model.Categoria
import java.time.LocalDate

class FormFragment : Fragment(), TimerPickerListener {

    private lateinit var binding: FragmentFormBinding

    // Aqui indicamos que todas as instancias da viewModel que criarmos
    // que utilizar o metodo activityViewModels(), vamos conseguir criar
    // uma instancia da nossa viewModel para sobreviver em todas as nossas telas
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        mainViewModel.listCotegoria()
        mainViewModel.dataSelecionada.value = LocalDate.now()

        // Vamos observar a variavel myCategoriaResponse, que é que traz nossos dados
        // O viewLifecycleOwner é para observar com base no ciclo de vida do nosso fragment
        mainViewModel.myCategoriaResponse.observe(viewLifecycleOwner){
            // Fazendo com que o dado seja logado para nós.
            // Trazendo as infos do nosso banco, verificando se funciona
            response -> Log.d("Requisicao", response.body().toString())
            spinnerCategoria(response.body())
        }

        mainViewModel.dataSelecionada.observe(viewLifecycleOwner){
            selectedDate -> binding.editData.setText(selectedDate.toString())
        }

        binding.buttonSalvar.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        binding.editData.setOnClickListener {
            DatePickerFragment(this)
                .show(parentFragmentManager, "DatePicker")
        }

        return binding.root
    }

    fun spinnerCategoria(listCategoria: List<Categoria>?){
        if (listCategoria != null){
            binding.spinnerCategoria.adapter = ArrayAdapter(
                requireContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                listCategoria
            )
        }
    }

    override fun onDateSelected(date: LocalDate) {
        mainViewModel.dataSelecionada.value = date

    }
}