package com.ruben.paresnones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.ruben.paresnones.R.databinding.FragmentParesNonesBinding;

public class ParesNonesFragment extends Fragment {
    private FragmentParesNones binding;
    return (binding = FragmentParesNonesBinding.inflate(inflater, container, false)).getRoot();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentParesNonesBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final com.example.pares_y_nones.ParesNonesViewModel paresNonesViewModel = new ViewModelProvider(this).get(com.example.pares_y_nones.ParesNonesViewModel.class);

        binding.p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Aquí debes implementar la lógica del juego Pares y Nones.
                // Genera un número al azar con Math.random para num2.
                // Calcula el resultado y muestra si es pares o nones.
            }
        });
    }
}
