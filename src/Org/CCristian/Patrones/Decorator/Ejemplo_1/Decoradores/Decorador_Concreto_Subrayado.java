package Org.CCristian.Patrones.Decorator.Ejemplo_1.Decoradores;

import Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes.Componente_Formateable;

public class Decorador_Concreto_Subrayado extends Decorador_TextoDecorador{
/*-------------CONSTRUCTOR-------------*/
    public Decorador_Concreto_Subrayado(Componente_Formateable texto) {
        super(texto);
    }
/*-------------MÉTODOS-------------*/
    @Override
    public String darFormato() {
        int largoString = texto.darFormato().length();
        StringBuilder sB = new StringBuilder(texto.darFormato());
        sB.append("\n");
        sB.append("_".repeat(largoString));
        return sB.toString();
    }

}
