package Org.CCristian.Patrones.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite_Directorio extends Component_Componente{

/*--------------ATRIBUTOS--------------*/
    List<Component_Componente> hijos;
/*--------------CONSTRUCTOR--------------*/
    public Composite_Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }
/*--------------MÉTODOS--------------*/
    public Composite_Directorio addComponente(Component_Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Component_Componente c){
        hijos.remove(c);
    }

    @Override
    public String mostrar(int nivel) {
        StringBuilder sB = new StringBuilder("\t".repeat(nivel));
        sB.append(nombre).append("/").append("\n");
        for (Component_Componente hijo: this.hijos){
            sB.append(hijo.mostrar(nivel+1));
            if (hijo instanceof Leaf_Archivo) {
                sB.append("\n");
            }
        }
        return sB.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if (this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }
//        for (Component_Componente hijo: hijos){
//            if (hijo.buscar(nombre)){
//                return true;
//            }
//        }

        return hijos.stream().anyMatch(hijo -> hijo.buscar(nombre));
    }
}
