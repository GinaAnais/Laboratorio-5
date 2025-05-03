package Ejercicio;

public class Ejercicio6<T> {

    // Nodo que representa un elemento de la lista
    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        public Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Método para insertar un nodo al final de la lista
    public static <T> Nodo<T> insertarAlFinal(Nodo<T> cabeza, T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }

        return cabeza;
    }

    // Método para concatenar dos listas enlazadas
    public static <T> Nodo<T> concatenarListas(Nodo<T> cabeza1, Nodo<T> cabeza2) {
        if (cabeza1 == null) {
            return cabeza2;
        }
        if (cabeza2 == null) {
            return cabeza1;
        }
        
        Nodo<T> actual = cabeza1;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = cabeza2;

        return cabeza1;
    }

    // Método para imprimir los elementos de la lista
    public static <T> void imprimirLista(Nodo<T> cabeza) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Nodo<Integer> lista1 = null;
        Nodo<Integer> lista2 = null;

        lista1 = insertarAlFinal(lista1, 1);
        lista1 = insertarAlFinal(lista1, 2);
        lista1 = insertarAlFinal(lista1, 3);

        lista2 = insertarAlFinal(lista2, 4);
        lista2 = insertarAlFinal(lista2, 5);
        lista2 = insertarAlFinal(lista2, 6);

        // Imprimimos las listas originales
        System.out.println("Lista 1:");
        imprimirLista(lista1);
        System.out.println("Lista 2:");
        imprimirLista(lista2);

        // Concatenamos las dos listas
        Nodo<Integer> listaConcatenada = concatenarListas(lista1, lista2);

        // Imprimimos la lista concatenada
        System.out.println("Lista concatenada:");
        imprimirLista(listaConcatenada);
    }
}
