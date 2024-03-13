package Org.CCristian.Patrones.Decorator.Ejemplo_2.Componente;

public class Componente_Concreto_Cafe implements Componente_Configurable{

/*-------------ATRIBUTOS-------------*/
    private float precio;
    private String nombre;
/*-------------CONSTRUCTOR-------------*/
    public Componente_Concreto_Cafe(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }
/*-------------MÉTODOS-------------*/
    @Override
    public float getPrecioBase() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.nombre;
    }
}
