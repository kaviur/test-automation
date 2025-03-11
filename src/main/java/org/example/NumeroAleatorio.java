package org.example;

public class NumeroAleatorio {

    public static void main(String[] args) {
        System.out.println(NumeroAleatorio.numeroAleatorioEnRango(1, 10));
    }

    public static int numeroAleatorioEnRango(int min, int max){
        if (min > max) {
            throw new IllegalArgumentException("min debe ser menor o igual que max");
        }
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
