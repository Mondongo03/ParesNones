package com.example.pares_y_nones;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class ParesNonesViewModel extends AndroidViewModel {

    MutableLiveData<String> resultadoJuego = new MutableLiveData<>();

    public ParesNonesViewModel(@NonNull Application application) {
        super(application);
    }

    public void jugar(String nombre, int num1ElegidoPorUsuario, boolean apuestaPorPares) {
        if (num1ElegidoPorUsuario < 1 || num1ElegidoPorUsuario > 100) {
            resultadoJuego.postValue("Número fuera de rango. Debe estar entre 1 y 100.");
            return;
        }

        int num2 = (int) (Math.random() * 100) + 1; // Generar número aleatorio del 1 al 100

        int total = num1ElegidoPorUsuario + num2;
        boolean esPar = total % 2 == 0;

        String resultado;
        if ((esPar && apuestaPorPares) || (!esPar && !apuestaPorPares)) {
            resultado = nombre + " ha ganado porque el total ha sido " + total + " y es " + (esPar ? "pares" : "nones");
        } else {
            resultado = nombre + " ha perdido porque el total ha sido " + total + " y es " + (esPar ? "pares" : "nones");
        }

        resultadoJuego.postValue(resultado);
    }
}

