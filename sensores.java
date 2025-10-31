public class sensores extends Equipos implements Medible{
    private String medicion;

    public sensores(int ID, String nombre, int consumo, String medicion) {
        super(ID, nombre, consumo);
        this.medicion = medicion;
    }

    @Override
    public String medir() {
        return "Sensor " + nombre + " midiendo: " + medicion;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Medición: " + medicion;
    }
}
