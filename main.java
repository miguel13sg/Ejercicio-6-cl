public class main {
    // Metodo principal - punto de entrada del programa
    public static void main(String[] args) {
        
        // Crear las instancias del modelo, vista y controlador
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        
        // Iniciar la ejecucion del sistema
        controlador.iniciar();
    }
}
