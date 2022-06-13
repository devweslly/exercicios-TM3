package com.example.todo

import android.os.Bundle
import android.service.controls.actions.FloatAction
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todo.adapter.TarefaAdapter
import com.example.todo.databinding.FragmentListBinding
import com.example.todo.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton


class ListFragment : Fragment() {

    // O tipo é a class FragmentListBinding gerada pelo viewBinding
    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Para o xml (por exemplo uma tela) aparecer é preciso inflar ele.
        // Para o ListFragment receber a view fragment_list, é preciso inflar e retornar ela
        // dentro do método onCreateView

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        /*
        // A val listTarefa vai guardar uma listagem do tipo listOf
        // listOf será de varios objetos do tipo Tarefa
        val listTarefa = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar louça do dia",
                "Weslly",
                "2022-06-07",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Academia",
                "Ir para academia",
                "Weslly",
                "2022-06-07",
                false,
                "Saúde"
            ),
            Tarefa(
                "Progrmação",
                "Estudar Android",
                "Weslly",
                "2022-06-07",
                false,
                "Orientação ao Futuro"
            )
        )
        */

        // Configuração do Recycler View
        val adapter = TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        // Navegar para o próximo fragment
        binding.floatingAdd.setOnClickListener {
            // Achar o fragmentController e fazer a navegação
            // Este metodo verifica quem ta fazendo a navegação
            findNavController().navigate(R.id.action_listFragment_to_formFragment)

        }

        return binding.root
    }
}