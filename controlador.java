import java.util.List;

public class controlador {
    private modelo modelo;
    private vista vista;
    private boolean ejecutando;
    
    // Constructor del controlador con inyeccion de dependencias
    public controlador(modelo modelo, vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.ejecutando = true;
    }
    
    // Metodo principal que inicia el bucle de ejecucion del sistema
    public void iniciar() {
        while (ejecutando) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();
            procesarOpcion(opcion);
        }
    }
    
    // Procesa la opcion seleccionada por el usuario
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                listarTodosEquipos();
                break;
            case 2:
                buscarPorID();
                break;
            case 3:
                buscarPorNombre();
                break;
            case 4:
                ordenarPorConsumo();
                break;
            case 5:
                añadirNuevoEquipo();
                break;
            case 6:
                ejecutando = false;
                break;
            default:
                vista.mostrarError("Opción inválida. Intente nuevamente.");
        }
    }
    
    // Lista todos los equipos del catalogo
    private void listarTodosEquipos() {
        List<Equipos> equipos = modelo.getTodosEquipos();
        vista.mostrarListaEquipos(equipos);
    }
    
    // Busca un equipo por su ID unico
    private void buscarPorID() {
        int id = vista.leerID();
        Equipos equipo = modelo.buscarEquipo(id);
        List<String> capacidades = modelo.obtenerCapacidades(equipo);
        vista.mostrarEquipo(equipo, capacidades);
    }
    
    // Busca equipos por nombre o parte del nombre
    private void buscarPorNombre() {
        String nombre = vista.leerNombre();
        List<Equipos> equipos = modelo.buscarEquipo(nombre);
        vista.mostrarListaEquipos(equipos);
    }
    
    // Ordena y muestra equipos por consumo electrico
    private void ordenarPorConsumo() {
        List<Equipos> equiposOrdenados = modelo.ordenarPorConsumo();
        vista.mostrarListaEquipos(equiposOrdenados);
    }
    
    // Gestiona el proceso de añadir un nuevo equipo al sistema
    private void añadirNuevoEquipo() {
        try {
            vista.mostrarMensaje("\n=== AÑADIR NUEVO EQUIPO ===");
            
            int tipo = vista.leerTipoEquipo();
            
            int id = vista.leerNuevoID();
            String nombre = vista.leerNuevoNombre();
            int consumo = vista.leerNuevoConsumo();
            
            // Verifica que el ID no exista previamente
            if (modelo.existeID(id)) {
                vista.mostrarError("El ID " + id + " ya existe. Use otro ID.");
                return;
            }
            
            Equipos nuevoEquipo = null;
            
            // Crea el equipo segun el tipo seleccionado
            switch (tipo) {
                case 1: 
                    String accion = vista.leerAccionDron();
                    nuevoEquipo = new drones(id, nombre, consumo, accion);
                    break;
                    
                case 2: 
                    String[] parametros = vista.leerParametrosEstacion();
                    nuevoEquipo = new estaciones(id, nombre, consumo, parametros);
                    break;
                    
                case 3: 
                    String medicion = vista.leerTipoMedicion();
                    nuevoEquipo = new sensores(id, nombre, consumo, medicion);
                    break;
                    
                default:
                    vista.mostrarError("Tipo de equipo inválido.");
                    return;
            }
            
            // Agrega el nuevo equipo al modelo
            modelo.agregarEquipo(nuevoEquipo);
            vista.mostrarMensaje("Equipo añadido exitosamente!");
            vista.mostrarMensaje("Nuevo equipo: " + nuevoEquipo.getInfo());
            
        } catch (Exception e) {
            vista.mostrarError("Error al añadir equipo: " + e.getMessage());
        }
    }
}
