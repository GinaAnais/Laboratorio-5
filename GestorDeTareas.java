package Actividad;

public class GestorDeTareas<T> {
    private Node<T> cabeza;
    private Node<T> cola;
    private int tamaño;

    public GestorDeTareas() {
        this.cabeza = null;
        this.cola = null;
        this.tamaño = 0;
    }

    public void agregarTarea(T tarea) {
        Node<T> nuevoNodo = new Node<>(tarea);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.setNext(nuevoNodo);
            cola = nuevoNodo;
        }
        tamaño++;
    }

    public boolean eliminarTarea(T tarea) {
        if (cabeza == null) {
            return false;
        }

        // Eliminar la tarea si está al principio de la lista
        if (cabeza.getData().equals(tarea)) {
            cabeza = cabeza.getNext();
            tamaño--;
            if (cabeza == null) {
                cola = null;
            }
            return true;
        }

        // Buscar la tarea en el resto de la lista
        Node<T> actual = cabeza;
        while (actual.getNext() != null && !actual.getNext().getData().equals(tarea)) {
            actual = actual.getNext();
        }

        if (actual.getNext() != null) {
            if (actual.getNext() == cola) {
                cola = actual;
            }
            actual.setNext(actual.getNext().getNext());
            tamaño--;
            return true;
        }
        return false;
    }

    public boolean contieneTarea(T tarea) {
        Node<T> actual = cabeza;
        while (actual != null) {
            if (actual.getData().equals(tarea)) {
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public void imprimirTareas() {
        Node<T> actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getData().toString());
            actual = actual.getNext();
        }
    }

    public int contarTareas() {
        return tamaño;
    }

    public T obtenerTareaMasPrioritaria() {
        if (cabeza == null) {
            return null;
        }

        if (!(cabeza.getData() instanceof Tarea)) {
            throw new UnsupportedOperationException("Este método solo funciona con objetos de tipo Tarea");
        }

        Node<T> actual = cabeza;
        Tarea tareaMasPrioritaria = (Tarea) actual.getData();
        actual = actual.getNext();

        while (actual != null) {
            Tarea tareaActual = (Tarea) actual.getData();
            if (tareaActual.getPrioridad() < tareaMasPrioritaria.getPrioridad()) {
                tareaMasPrioritaria = tareaActual;
            }
            actual = actual.getNext();
        }

        return (T) tareaMasPrioritaria;
    }

    public void invertirTareas() {
        Node<T> previo = null;
        Node<T> actual = cabeza;
        Node<T> siguiente = null;
        cola = cabeza; 

        while (actual != null) {
            siguiente = actual.getNext();
            actual.setNext(previo);
            previo = actual;
            actual = siguiente;
        }

        cabeza = previo; 
    }

    public Node<T> getCabeza() {
        return cabeza;
    }

    public Node<T> getCola() {
        return cola;
    }
}
