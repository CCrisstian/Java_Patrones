package Org.CCristian.Patrones.Singleton;

public class Conexion_BaseDeDatos_Singleton {

/*--------------ATRIBUTOS--------------*/
    private static Conexion_BaseDeDatos_Singleton instancia;  /*Atributo Estático*/
/*--------------CONSTRUCTOR--------------*/
    private Conexion_BaseDeDatos_Singleton(){   /*Constructor Privado*/
        System.out.println("Conectandose a algún motor de Base de Datos");
    }
/*--------------MÉTODOS--------------*/
    public static Conexion_BaseDeDatos_Singleton getInstancia (){
        if (instancia == null){
            instancia = new Conexion_BaseDeDatos_Singleton();
        }
        return instancia;
    }

}
