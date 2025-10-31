import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class modelo {
    private List<Equipos> catalogo;
    private int ultimoID;
    
    public modelo() {
        this.catalogo = new ArrayList<>();
        this.ultimoID = 10;
        inicializarCatalogo();
    }
    
    private void inicializarCatalogo() {
        // Drones
        catalogo.add(new drones(1, "Dron Riego A1", 150, "Riego automático"));
        catalogo.add(new drones(2, "Dron Monitoreo B2", 200, "Captura imágenes"));
        catalogo.add(new drones(3, "Dron Fumigación C3", 180, "Aplicación fitosanitarios"));
        
        // Estaciones
        catalogo.add(new estaciones(4, "Estación Meteo Norte", 80, 
            new String[]{"Temperatura", "Humedad", "Viento"}));
        catalogo.add(new estaciones(5, "Estación Meteo Sur", 75, 
            new String[]{"Temperatura", "Presión", "Precipitación"}));
        catalogo.add(new estaciones(6, "Estación Suelo Este", 90, 
            new String[]{"Humedad suelo", "pH", "Nutrientes"}));
        
        // Sensores
        catalogo.add(new sensores(7, "Sensor Humedad Z1", 25, "Humedad del suelo"));
        catalogo.add(new sensores(8, "Sensor Temperatura Z2", 20, "Temperatura ambiente"));
        catalogo.add(new sensores(9, "Sensor pH Z3", 30, "Acidez del suelo"));
        catalogo.add(new sensores(10, "Sensor Luz Z4", 15, "Intensidad lumínica"));
    }
    
    public List<Equipos> getTodosEquipos() {
        return new ArrayList<>(catalogo);
    }
    
    // OVERLOADING: Búsqueda por ID y por nombre
    public Equipos buscarEquipo(int id) {
        for (Equipos equipo : catalogo) {
            if (equipo.getID() == id) {
                return equipo;
            }
        }
        return null;
    }
    
    public List<Equipos> buscarEquipo(String nombre) {
        List<Equipos> resultados = new ArrayList<>();
        for (Equipos equipo : catalogo) {
            if (equipo.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                resultados.add(equipo);
            }
        }
        return resultados;
    }
    
    public List<Equipos> ordenarPorConsumo() {
        List<Equipos> ordenado = new ArrayList<>(catalogo);
        ordenado.sort(Comparator.comparingInt(Equipos::getConsumo));
        return ordenado;
    }
    
    public List<String> obtenerCapacidades(Equipos equipo) {
        List<String> capacidades = new ArrayList<>();
        
        if (equipo instanceof Medible) {
            capacidades.add(((Medible) equipo).medir());
        }
        
        if (equipo instanceof Accionable) {
            capacidades.add(((Accionable) equipo).ejecutarAccion());
        }
        
        if (equipo instanceof Registrable) {
            capacidades.add(((Registrable) equipo).registrar());
        }
        
        return capacidades;
    }
    public void agregarEquipo(Equipos nuevoEquipo) {
        catalogo.add(nuevoEquipo);
    }
    
    public int generarNuevoID() {
        return ++ultimoID;
    }
    
    public boolean existeID(int id) {
        for (Equipos equipo : catalogo) {
            if (equipo.getID() == id) {
                return true;
            }
        }
        return false;
    }
}