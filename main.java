public class main {
    public static void main(String[] args) {
        
        modelo modelo = new modelo();
        vista vista = new vista();
        controlador controlador = new controlador(modelo, vista);
        
        
        controlador.iniciar();
    }
}