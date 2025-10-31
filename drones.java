public class drones extends Equipos implements Accionable, Registrable{
    private String accion;
    
    public drones(int ID, String nombre, int consumo, String accion)
    {
        super(ID, nombre, consumo);
        this.accion = accion;
    }
    @Override
    public String ejecutarAccion() {
        return "Dron " + nombre + " ejecutando: " + accion;
    }
    @Override
    public String registrar() {
        return "Dron " + nombre + " registrando imágenes multiespectrales";
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", Acción: " + accion;
    }
}
