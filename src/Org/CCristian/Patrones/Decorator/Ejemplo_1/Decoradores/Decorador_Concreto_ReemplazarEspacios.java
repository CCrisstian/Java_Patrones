package Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.Componente_Formateable;

public class Decorador_Concreto_ReemplazarEspacios extends Decorador_TextoDecorador{

/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_ReemplazarEspacios(Componente_Formateable texto) {
        super(texto);
    }
/*-------------MÉTODOS-------------*/
    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}
