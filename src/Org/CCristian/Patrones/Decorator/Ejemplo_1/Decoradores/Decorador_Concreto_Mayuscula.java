package Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.Componente_Formateable;

public class Decorador_Concreto_Mayuscula extends Decorador_TextoDecorador{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_Mayuscula(Componente_Formateable texto) {
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
