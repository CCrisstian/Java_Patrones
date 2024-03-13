package Org.CCristian.Patrones.Decorator.Ejemplo_1.Componentes;

public class Componente_Concreto_Texto implements Componente_Formateable{
/*-------------ATRIBUTOS-------------*/
    private String texto;
/*-------------CONSTRUCTOR-------------*/
    public Componente_Concreto_Texto(String texto) {
        this.texto = texto;
    }
/*-------------GETTER-------------*/
    public String getTexto() {
        return texto;
    }
/*-------------MÉTODOS-------------*/
    @Override
    public String darFormato() {
        return getTexto();
    }
}
