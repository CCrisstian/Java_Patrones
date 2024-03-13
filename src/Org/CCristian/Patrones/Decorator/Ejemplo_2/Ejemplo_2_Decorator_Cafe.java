package Org.CCristian.Patrones.Decorator.Ejemplo_2;

import Org.CCristian.Patrones.Decorator.Ejemplo_2.Componente.*;
import Org.CCristian.Patrones.Decorator.Ejemplo_2.Decorador.*;

public class Ejemplo_2_Decorator_Cafe {
    public static void main(String[] args) {

        Componente_Configurable cafe = new Componente_Concreto_Cafe(7,"Cafe Mocha");

        Decorador_Concreto_conCrema conCrema = new Decorador_Concreto_conCrema(cafe);
        Decorador_Concreto_conLeche conLeche = new Decorador_Concreto_conLeche(conCrema);
        Decorador_Concreto_conChocolate conChocolate = new Decorador_Concreto_conChocolate(conLeche);

        System.out.println(cafe.getIngredientes());
        System.out.println("Cafe Mocha (precio base) = " + cafe.getPrecioBase());
        System.out.println("\t\tcafe + conCrema");
        System.out.println("\t\t"+cafe.getPrecioBase() +" + "+ (conCrema.getPrecioBase() - cafe.getPrecioBase()));
        System.out.println("\t\tcafe + conCrema + conLeche");
        System.out.println("\t\t"+cafe.getPrecioBase() +" + "+ (conCrema.getPrecioBase() - cafe.getPrecioBase())+" + "+ (conLeche.getPrecioBase() - conCrema.getPrecioBase()));
        System.out.println("\t\tcafe + conCrema + conLeche + conChocolate");
        System.out.println("\t\t"+cafe.getPrecioBase() +" + "+ (conCrema.getPrecioBase() - cafe.getPrecioBase())+" + "+ (conLeche.getPrecioBase() - conCrema.getPrecioBase())+" + "+ (conChocolate.getPrecioBase() - conLeche.getPrecioBase()));

        System.out.println("Cafe Mocha (Ingredientes) = " + conChocolate.getIngredientes());
        System.out.println("Cafe Mocha (PrecioBase) = " + conChocolate.getPrecioBase());


        Componente_Configurable capuchino = new Componente_Concreto_Cafe(4,"Cafe Capuchino");

        conCrema = new Decorador_Concreto_conCrema(capuchino);
        conLeche = new Decorador_Concreto_conLeche(conCrema);

        System.out.println("\n" + capuchino.getIngredientes());
        System.out.println("Capuchino (precio base) = " + capuchino.getPrecioBase());
        System.out.println("\t\tcapuchino + conCrema");
        System.out.println("\t\t"+capuchino.getPrecioBase() +" + "+ (conCrema.getPrecioBase() - capuchino.getPrecioBase()));
        System.out.println("\t\tcapuchino + conCrema + conLeche");
        System.out.println("\t\t"+capuchino.getPrecioBase() +" + "+ (conCrema.getPrecioBase() - capuchino.getPrecioBase())+" + "+ (conLeche.getPrecioBase() - conCrema.getPrecioBase()));

        System.out.println("cafe Capuchino (Ingredientes) = " + conLeche.getIngredientes());
        System.out.println("cafe Capuchino (PrecioBase) = " + conLeche.getPrecioBase());

        Componente_Configurable espresso = new Componente_Concreto_Cafe(3, "Cafe Espresso");
        System.out.println("\n"+espresso.getIngredientes());
        System.out.println("Espresso (PrecioBase) = " + espresso.getPrecioBase());
    }
}
