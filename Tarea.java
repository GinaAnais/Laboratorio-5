package Actividad;

import java.util.Objects;

public class Tarea {
    private String titulo;
    private int prioridad;

    public Tarea(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "titulo='" + titulo + '\'' + ", prioridad=" + prioridad + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return prioridad == tarea.prioridad && titulo.equals(tarea.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, prioridad);
    }
}

