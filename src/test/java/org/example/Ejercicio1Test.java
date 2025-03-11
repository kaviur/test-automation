package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;


class Ejercicio1Test {

    //Crea un objeto simulado de la clase List y verifica que el método size() devuelve su valor predeterminado
    @Test
    @SuppressWarnings("unchecked") // Para q no me de sugerencias. al
    public void createMockObject() {
        List<String> mockedList = mock(ArrayList.class);
        int size = mockedList.size();
        assertEquals(0, size);
    }

    @SuppressWarnings("unchecked")
    @Test
    void configureMockObject2 (){
        List<String> listaMock2 = mock(List.class);
        int tamanhoLista2 = 20;
        when(listaMock2.size()).thenReturn(tamanhoLista2);
        int tamanho2 = listaMock2.size();
        assertEquals(tamanhoLista2, tamanho2);
    }

    @Test
    public void crearObjetoEspia() {
        List<String> spyList = spy(new ArrayList<>());
        int tamanioEspia = spyList.size();
        assertEquals(0, tamanioEspia);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }

    @ParameterizedTest
    @ValueSource(ints = { 1, 2, 5, -3, 0, 10 })
    void testDoble(Integer number) {
        Integer esperado = number * 2;

        assertEquals(esperado, Ejercicio1.doble(number));
    }
}