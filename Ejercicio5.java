package Ejercicio;

public class Ejercicio5<T> {

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

    // Método para comparar dos listas enlazadas
    public static <T> boolean sonIguales(Nodo<T> cabeza1, Nodo<T> cabeza2) {
        Nodo<T> actual1 = cabeza1;
        Nodo<T> actual2 = cabeza2;

        while (actual1 != null && actual2 != null) {
            if (!actual1.valor.equals(actual2.valor)) {
                return false;  
            }
            actual1 = actual1.siguiente;
            actual2 = actual2.siguiente;
        }

        // Si ambas listas han terminado al mismo tiempo, son iguales
        return actual1 == null && actual2 == null;
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

        // Insertamos elementos en las listas
        lista1 = insertarAlFinal(lista1, 1);
        lista1 = insertarAlFinal(lista1, 2);
        lista1 = insertarAlFinal(lista1, 3);

        lista2 = insertarAlFinal(lista2, 1);
        lista2 = insertarAlFinal(lista2, 2);
        lista2 = insertarAlFinal(lista2, 3);

        // Imprimimos las listas
        System.out.println("Lista 1:");
        imprimirLista(lista1);
        System.out.println("Lista 2:");
        imprimirLista(lista2);

        // Comparamos las listas
        boolean iguales = sonIguales(lista1, lista2);
        System.out.println("¿Las listas son iguales? " + (iguales ? "Sí" : "No"));
    }
}
