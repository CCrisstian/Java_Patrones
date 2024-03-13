package Org.CCristian.Patrones.Composite.Ejemplo;

import Org.CCristian.Patrones.Composite.*;

public class Ejemplo_Composite_mostrar {
    public static void main(String[] args) {

        Composite_Directorio directorio = new Composite_Directorio("Documentos");

        Composite_Directorio java = new Composite_Directorio("Java");
        java.addComponente(new Leaf_Archivo("patron-Composite.docx"));

        Composite_Directorio stream = new Composite_Directorio("Api Stream");
        stream.addComponente(new Leaf_Archivo("stream-map-docx"));
        java.addComponente(stream);

        directorio.addComponente(java);
        directorio.addComponente(new Leaf_Archivo("cv.docx"));
        directorio.addComponente(new Leaf_Archivo("logo.jpeg"));

        System.out.println(directorio.mostrar(0));
    }
}
