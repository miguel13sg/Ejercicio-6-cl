public class sensores extends Equipos implements Medible{
    private String medicion;

    // Constructor de la clase sensores
    public sensores(int ID, String nombre, int consumo, String medicion) {
        super(ID, nombre, consumo);
        this.medicion = medicion;
    }

    // Implementacion del metodo de la interfaz Medible
    @Override
    public String medir() {
        return "Sensor " + nombre + " midiendo: " + medicion;
    }

    // Sobrescribe el metodo getInfo para incluir informacion especifica de sensores
    @Override
    public String getInfo() {
        return super.getInfo() + ", Medición: " + medicion;
    }
}
