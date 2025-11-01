public class estaciones extends Equipos implements Medible, Registrable{
    private String[] parametros;
    
    // Constructor de la clase estaciones
    public estaciones(int ID, String nombre, int consumo, String[] parametros) {
        super(ID, nombre, consumo);
        this.parametros = parametros;
    }

    // Implementacion del metodo de la interfaz Medible
    @Override
    public String medir() {
        return "Estación " + nombre + " midiendo: " + String.join(", ", parametros);
    }

    // Implementacion del metodo de la interfaz Registrable
    @Override
    public String registrar() {
        return "Estación " + nombre + " registrando datos meteorológicos";
    }
    
    // Sobrescribe el metodo getInfo para incluir informacion especifica de estaciones
    @Override
    public String getInfo() {
        return super.getInfo() + ", Parámetros: " + String.join(", ", parametros);
    }
}
