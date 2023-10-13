public interface IEncuestaDao {
    void agregarEstudiante(String nombre, String apellido, int edad, String correo) throws Exception;
    void mostrarEstudiantes();
}
