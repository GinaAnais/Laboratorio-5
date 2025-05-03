package Ejercicio;


public class Ejercicio3<T> {

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
        Nodo<Integer> cabeza = null;

        // Insertamos elementos en la lista
        cabeza = insertarAlFinal(cabeza, 1);
        cabeza = insertarAlFinal(cabeza, 2);
        cabeza = insertarAlFinal(cabeza, 3);
        cabeza = insertarAlFinal(cabeza, 4);

        // Imprimir la lista
        System.out.println("Lista enlazada:");
        imprimirLista(cabeza);  
    }
}
