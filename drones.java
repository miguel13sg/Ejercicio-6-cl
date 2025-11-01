public class drones extends Equipos implements Accionable, Registrable{
    private String accion;
    
    // Constructor de la clase drones
    public drones(int ID, String nombre, int consumo, String accion)
    {
        super(ID, nombre, consumo);
        this.accion = accion;
    }
    
    // Implementacion del metodo de la interfaz Accionable
    @Override
    public String ejecutarAccion() {
        return "Dron " + nombre + " ejecutando: " + accion;
    }
    
    // Implementacion del metodo de la interfaz Registrable
    @Override
    public String registrar() {
        return "Dron " + nombre + " registrando imágenes multiespectrales";
    }
    
    // Sobrescribe el metodo getInfo para incluir informacion especifica de drones
    @Override
    public String getInfo() {
        return super.getInfo() + ", Acción: " + accion;
    }
}
