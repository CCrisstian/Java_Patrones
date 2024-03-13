package Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.Componente_Formateable;

abstract public class Decorador_TextoDecorador implements Componente_Formateable {

/*-------------ATRIBUTOS-------------*/
    protected Componente_Formateable texto;
/*-------------MÉTODOS-------------*/
    public Decorador_TextoDecorador(Componente_Formateable texto) {
        this.texto = texto;
    }
}
