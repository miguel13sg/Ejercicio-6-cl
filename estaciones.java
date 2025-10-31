public class estaciones extends Equipos implements Medible, Registrable{
    private String[] parametros;
    
    public estaciones(int ID, String nombre, int consumo, String[] parametros) {
        super(ID, nombre, consumo);
        this.parametros = parametros;
    }

    @Override
    public String medir() {
        return "Estación " + nombre + " midiendo: " + String.join(", ", parametros);
    }

    @Override
    public String registrar() {
        return "Estación " + nombre + " registrando datos meteorológicos";
    }
    
    @Override
    public String getInfo() {
        return super.getInfo() + ", Parámetros: " + String.join(", ", parametros);
    }
}
