package Org.CCristian.Patrones.Composite;

import java.util.Objects;

abstract public class Component_Componente {
/*--------------ATRIBUTOS--------------*/
    protected String nombre;
/*--------------CONSTRUCTOR--------------*/
    public Component_Componente(String nombre) {
        this.nombre = nombre;
    }
/*--------------GETTER--------------*/
    public String getNombre() {
        return nombre;
    }
/*--------------MÉTODOS--------------*/
    abstract public String mostrar(int nivel);

    abstract public boolean buscar(String nombre);
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Component_Componente that = (Component_Componente) object;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
