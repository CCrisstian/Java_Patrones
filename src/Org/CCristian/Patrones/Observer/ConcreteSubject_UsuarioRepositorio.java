package Org.CCristian.Patrones.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject_UsuarioRepositorio extends  Subject_Observable{

/*--------------ATRIBUTOS--------------*/
    private List<String> repositorio = new ArrayList<>();
/*--------------MÉTODOS--------------*/
    public void crearUsuario(String usuario){
        repositorio.add(usuario);
        notifyObservers(usuario);
    }

}
