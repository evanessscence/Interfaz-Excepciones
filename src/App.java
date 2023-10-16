import service.*;
public class App {
        
        public static void main(String[] args) throws Exception {
            String nombre = "";
            String apellido = "f";
            int edad = 80;
            String correo = "ana@gmail.com";
            try {
                Encuesta encuesta = new service.Encuesta();
                encuesta.agregarEstudiante(nombre, apellido, edad, correo); 
                encuesta.mostrarEstudiantes(); 
            }
            catch (Excepciones.correoExcepcion e) // También se pueden importar y llamar solo por su nombre.
            {
                System.out.println(e.getMessage());
            }
            catch (Excepciones.nullExcepcion e) {
                System.out.println(e.getMessage());
            }
             catch (Excepciones.EdadExcepcion e) {
                System.out.println(e.getMessage());
            }
            catch (NullPointerException e) { // Error si la lista no tiene ningún elemento.
                System.out.println(e.getMessage());
            }
        }
    }

