package Org.CCristian.Patrones.Observer.Ejemplo;

import Org.CCristian.Patrones.Observer.ConcreteSubject_UsuarioRepositorio;

public class Ejemplo_2_Observer {
    public static void main(String[] args) {

        ConcreteSubject_UsuarioRepositorio repositorio = new ConcreteSubject_UsuarioRepositorio();
        repositorio.addObservers((object , usuario) -> System.out.println("Enviando un email al usuario " + usuario));
        repositorio.addObservers((object , usuario) -> System.out.println("Enviando un email al administrador"));
        repositorio.addObservers((object , usuario) -> System.out.println("Guardando info del usuario "+usuario+" en el logs"));

        repositorio.crearUsuario("Cristian");
    }
}
