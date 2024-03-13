package Org.CCristian.Patrones.Composite;

public class Leaf_Archivo extends Component_Componente{

/*--------------CONSTRUCTOR--------------*/
    public Leaf_Archivo(String nombre) {
        super(nombre);
    }
/*--------------MÉTODOS--------------*/

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel) + nombre;
    }
}
