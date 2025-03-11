package org.example;

public class Ejercicio1 {
    //org.example.Ejercicio1: Clase java que incluye mis métodos a testear
    public static void main(String[] args) {

        Integer resultado = doble(5);
        System.out.println("El doble de 5 es: " + resultado);
    }

    // Metodo para calcular y retornar el "doble de un número"
    public static Integer doble(Integer numero) {
        return numero * 2;
    }


}