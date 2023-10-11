package com.ruben.paresnones;

public class SimuladorJuego {

    public interface Callback {
        void cuandoFinaliceJuego(int num1, int num2, boolean esPar, String resultado);
    }

    public void jugar(int num1ElegidoPorUsuario, Callback callback) {
        if (num1ElegidoPorUsuario < 1 || num1ElegidoPorUsuario > 100) {
            // Manejar el caso en el que el número elegido por el usuario está fuera de rango.
            callback.cuandoFinaliceJuego(-1, -1, false, "Número fuera de rango. Debe estar entre 1 y 100.");
            return;
        }

        int num2 = (int) (Math.random() * 100) + 1; // Generar número aleatorio del 1 al 100

        int total = num1ElegidoPorUsuario + num2;
        boolean esPar = total % 2 == 0;

        String resultado = "El total ha sido " + total + " y es " + (esPar ? "pares" : "nones");

        callback.cuandoFinaliceJuego(num1ElegidoPorUsuario, num2, esPar, resultado);
    }
}
