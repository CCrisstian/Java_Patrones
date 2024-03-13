package Org.CCristian.Patrones.Decorator.Ejemplo_2.Decorador;

import Org.CCristian.Patrones.Decorator.Ejemplo_2.Componente.Componente_Configurable;

public abstract class Decorador_Cafe implements Componente_Configurable {
/*-------------ATRIBUTOS-------------*/
    protected Componente_Configurable cafe;
/*-------------CONSTRUCTOR-------------*/
    public Decorador_Cafe(Componente_Configurable cafe) {
        this.cafe = cafe;
    }
}
