package Org.CCristian.Patrones.Observer.Ejemplo;

import Org.CCristian.Patrones.Observer.ConcreteSubject_Corporacion;

public class Ejemplo_Observer {
    public static void main(String[] args) {

        ConcreteSubject_Corporacion google = new ConcreteSubject_Corporacion("Google", 1000);

        google.addObservers((observador , object) -> System.out.println("John: " + observador));

        google.addObservers((observador , object) -> System.out.println("Andrés: " + observador));

        google.addObservers((observador , object) -> System.out.println("Maria: "+ observador));

        google.modificarPrecio(2000);
    }
}
