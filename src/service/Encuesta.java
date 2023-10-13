import java.util.*;

import model.Estudiante;

public class Encuesta implements IEncuestaDao {

    List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre, String apellido, int edad, String correo) throws Excepciones.nullExcepcion, Excepciones.EdadExcepcion, Excepciones.correoExcepcion {
        Estudiante estudiante = new Estudiante(nombre, apellido, edad, correo);
        if ((nombre.length() == 0) || (apellido.length() == 0) ) {
            throw new Excepciones.nullExcepcion("Este campo no puede estar vacío.");
        }
        if (edad > 50 || edad < 30) {
            throw new Excepciones.EdadExcepcion("El rango de edad está entre 30 y 50 años.");
        }
        if ((!correo.contains("@")) || (!correo.contains(".")))
        {
            throw new Excepciones.correoExcepcion("El correo no es válido.");
        }
        estudiantes.add(estudiante);
        System.out.println("Estudiante agregado.");
    }


    public void mostrarEstudiantes() {
        estudiantes.forEach(System.out::println);
    }
}