package Org.CCristian.Patrones.Observer;

import Org.CCristian.Patrones.Observer.Subject_Observable;

public class ConcreteSubject_Corporacion extends Subject_Observable {

/*--------------ATRIBUTOS--------------*/
    private String nombre;
    private int precio;
/*--------------CONSTRUCTOR--------------*/
    public ConcreteSubject_Corporacion(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
/*--------------GETTER--------------*/
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
/*--------------MÉTODOS--------------*/
    public void modificarPrecio(int precio){
        this.precio = precio;
        notifyObservers();
    }

    @Override
    public String toString() {
        return getNombre() + " nuevo precio $" + getPrecio();
    }
}
