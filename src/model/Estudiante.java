package model;

public class Estudiante {
    
    private String primerNombre;
    private String primerApellido;
    private int edad;
    private String correo;
    
    public Estudiante(String primerNombre, String primerApellido, int edad, String correo) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.edad = edad;
        this.correo = correo;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Estudiante{" +
                "primerNombre='" + primerNombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", edad=" + edad +
                ", correo='" + correo + '\'' +
                '}';
    }
}

    

