package Org.CCristian.Patrones.Singleton;

public class Ejemplo_Singleton {
    public static void main(String[] args) {

        Conexion_BaseDeDatos_Singleton con_1 = null;

        for (int i = 0; i < 10; i++){
            con_1 = Conexion_BaseDeDatos_Singleton.getInstancia();
            System.out.println("con_1 = " + con_1);
        }

        Conexion_BaseDeDatos_Singleton con_2 = Conexion_BaseDeDatos_Singleton.getInstancia();
        Conexion_BaseDeDatos_Singleton con_3 = Conexion_BaseDeDatos_Singleton.getInstancia();

        boolean b1 = (con_1 == con_2);
        /*'==' compara las referencias de dos objetos, verifica si ambos objetos apuntan a la misma ubicación de memoria.*/
        System.out.println("(con_1 == con_2) ---> " + b1);
        b1 = (con_2 == con_3);
        System.out.println("(con_2 == con_3) ---> " + b1);
        b1 = (con_1 == con_3);
        System.out.println("(con_1 == con_3) ---> " + b1);
        b1 = (con_1 == con_2) && (con_2 == con_3) && (con_1 == con_3);
        System.out.println("(con_1 == con_2) && (con_2 == con_3) && (con_1 == con_3) ---> " + b1);
    }
}