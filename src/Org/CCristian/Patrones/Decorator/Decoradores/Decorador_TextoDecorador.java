package Org.CCristian.Patrones.Decorator.Decoradores;

import Org.CCristian.Patrones.Decorator.Componentes.Componente_Formateable;

abstract public class Decorador_TextoDecorador implements Componente_Formateable {

/*-------------ATRIBUTOS-------------*/
    protected Componente_Formateable texto;
/*-------------MÉTODOS-------------*/
    public Decorador_TextoDecorador(Componente_Formateable texto) {
        this.texto = texto;
    }
}
