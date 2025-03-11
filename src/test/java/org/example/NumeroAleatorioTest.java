package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NumeroAleatorioTest {

    @ParameterizedTest
    @CsvSource({
            "1, 10",
            "-10, 10",
            "5, 5",
            "200, 300"
    })
    void testNumeroAleatorioDentroDeRango(int min, int max) {
        int resultado = NumeroAleatorio.numeroAleatorioEnRango(min, max);

        assertTrue(resultado >= min && resultado <= max,
                "El número generado " + resultado + " no está dentro del rango [" + min + ", " + max + "]");
    }

    @Test
    void testNumeroAleatorioMinMayorQueMax() {
        assertThrows(IllegalArgumentException.class, () -> {
            NumeroAleatorio.numeroAleatorioEnRango(10, 1);
        });
    }
}