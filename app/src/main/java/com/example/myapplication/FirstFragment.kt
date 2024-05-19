package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val d = TextDrawable(requireContext())
        d.text = "Nhập tối đa"
        d.textAlign = Layout.Alignment.ALIGN_CENTER
        d.setTextColor(Color.BLUE);
        d.textSize = resources.getDimensionPixelSize(R.dimen.text_size_14sp).toFloat()
        binding.mmInputMoneyLayout.endIconDrawable = OutsetDrawable(d, 0,0,resources.getDimensionPixelSize(R.dimen.margin_16dp), 0)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}