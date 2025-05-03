package Ejercicio;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Ejercicio1 {

    public static <T> boolean buscarElemento(List<T> lista, T elemento) {
        return lista != null && lista.contains(elemento);
    }

    public static void main(String[] args) {
        // Ejemplo con lista inmutable 
        List<Integer> numerosInmutables = List.of(1, 2, 3, 4, 5);
        System.out.println(buscarElemento(numerosInmutables, 3)); // true
        System.out.println(buscarElemento(numerosInmutables, 6)); // false

        // Ejemplo con lista mutable 
        List<String> palabras = new ArrayList<>(Arrays.asList("Camana", "Lima", "Arequipa"));
        System.out.println(buscarElemento(palabras, "Arequipa")); // true
        System.out.println(buscarElemento(palabras, "Argentina")); // false

        // Caso con lista null
        List<Double> listaNull = null;
        System.out.println(buscarElemento(listaNull, 2.5)); // false (no lanza excepción)
    }
}