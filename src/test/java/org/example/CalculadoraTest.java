package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class CalculadoraTest {

    @Test
    public void testSumaConMock() {
        // Crear un mock de Calculadora
        Calculadora mockCalculadora = mock(Calculadora.class);

        // Definir el comportamiento del mock
        when(mockCalculadora.sumar(2, 3)).thenReturn(10);

        // Llamar al método simulado
        int resultado = mockCalculadora.sumar(2, 3);

        // Verificar que el resultado es el esperado
        assertEquals(10, resultado);
    }
}
