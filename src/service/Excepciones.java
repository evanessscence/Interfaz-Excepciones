public class Excepciones extends Exception {
    public static class EdadExcepcion extends Exception {
        public EdadExcepcion(String message) {
            super(message); // Tira una excepcion cuando la edad no está entre 30 y 50 años.
        }
    }
    public static class correoExcepcion extends Exception {
        public correoExcepcion(String message) {
            super(message); // Tira una excepcion cuando el correo no es válido.
        }
    }
    public static class nullExcepcion extends Exception {
        public nullExcepcion(String message) {
            super(message); // Tira una excepcion cuando el campo está vacío.
        }
    }
}
    

