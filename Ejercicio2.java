package Ejercicio;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio2 {

    // Método para agregar elementos en orden invertido
    public static <T> List<T> invertirLista(List<T> lista) {
        List<T> listaInvertida = new ArrayList<>();
        agregarElementosInvertidos(lista, listaInvertida);
        return listaInvertida;
    }

    // Método que agrega los elementos en orden inverso
    private static <T> void agregarElementosInvertidos(List<T> lista, List<T> listaInvertida) {
        for (int i = lista.size() - 1; i >= 0; i--) {
            listaInvertida.add(lista.get(i));  
        }
    }

    public static void main(String[] args) {
        // Ejemplo con lista de enteros
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        System.out.println("Lista original: " + numeros);
        List<Integer> numerosInvertidos = invertirLista(numeros);
        System.out.println("Lista invertida: " + numerosInvertidos);

        // Ejemplo con lista de cadenas
        List<String> palabras = List.of("Java", "Python", "C++");
        System.out.println("Lista original: " + palabras);
        List<String> palabrasInvertidas = invertirLista(palabras);
        System.out.println("Lista invertida: " + palabrasInvertidas);
    }
}
