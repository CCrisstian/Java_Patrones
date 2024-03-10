package Org.CCristian.Patrones.Decorator.Decoradores;

import Org.CCristian.Patrones.Decorator.Componentes.Componente_Formateable;

public class Decorador_Concreto_MayusculaDecorador extends Decorador_TextoDecorador{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_MayusculaDecorador(Componente_Formateable texto) {
        super(texto);
    }
/*-------------MÉTODOS-------------*/
    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
        /*Característica original ---> texto.darFormato()*/
        /*Característica nueva ---> texto.darFormato().toUpperCase()*/
    }
}
