package Org.CCristian.Patrones.Decorator.Decoradores;

import Org.CCristian.Patrones.Decorator.Componentes.Componente_Formateable;

public class Decorador_Concreto_ReversaDecorador extends Decorador_TextoDecorador{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_ReversaDecorador(Componente_Formateable texto) {
        super(texto);
    }
/*-------------MÉTODOS-------------*/
    @Override
    public String darFormato() {
        StringBuilder sB = new StringBuilder(texto.darFormato());
        return sB.reverse().toString();
        /*Característica original ---> texto.darFormato()*/
        /*Característica nueva ---> texto.darFormato().reverse()*/
    }

}
