package Org.CCristian.Patrones.Decorator.Ejemplo_1;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.*;
import Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores.*;

public class Ejemplo_1_Decorator_Texto {
    public static void main(String[] args) {

        Componente_Formateable texto = new Componente_Concreto_Texto("Hola que tal Cristian!");

        Decorador_Concreto_Mayuscula mayuscula = new Decorador_Concreto_Mayuscula(texto);
        Decorador_Concreto_Reversa reversa = new Decorador_Concreto_Reversa(mayuscula);
        Decorador_Concreto_Subrayado subrayado = new Decorador_Concreto_Subrayado(reversa);
        Decorador_Concreto_ReemplazarEspacios reemplazarEspacios = new Decorador_Concreto_ReemplazarEspacios(subrayado);

        System.out.println(texto.darFormato());
        System.out.println("\ntexto  ---> mayúscula");
        System.out.println("texto  ---> mayúscula ---> reversa");
        System.out.println("texto  ---> mayúscula ---> reversa ---> subrayado");
        System.out.println("texto  ---> mayúscula ---> reversa ---> subrayado ---> reemplazarEspacios\n");

        System.out.println(reemplazarEspacios.darFormato());
    }
}
