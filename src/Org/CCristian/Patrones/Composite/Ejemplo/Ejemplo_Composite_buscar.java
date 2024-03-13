package Org.CCristian.Patrones.Composite.Ejemplo;

import Org.CCristian.Patrones.Composite.*;

public class Ejemplo_Composite_buscar {
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

        boolean encontrado = directorio.buscar("patron-Composite.docx");
        System.out.println("encontrado \"patron-Composite.docx\": " + encontrado);

        encontrado = directorio.buscar("Api Stream");
        System.out.println("encontrado \"Api Stream\": " + encontrado);

        encontrado = directorio.buscar("Api Strem");
        System.out.println("encontrado \"Api Strem\": " + encontrado);

        encontrado = directorio.buscar("cv.docx");
        System.out.println("encontrado \"cv.docx\": " + encontrado);

        encontrado = directorio.buscar("cv.doc");
        System.out.println("encontrado \"cv.doc\": " + encontrado);
    }
}
