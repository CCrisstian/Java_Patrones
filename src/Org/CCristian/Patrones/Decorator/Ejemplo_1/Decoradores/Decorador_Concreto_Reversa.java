package Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.Componente_Formateable;

public class Decorador_Concreto_Reversa extends Decorador_TextoDecorador{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_Reversa(Componente_Formateable texto) {
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
