import java.util.*;

public class vista {
    private Scanner scanner;
    
    public vista() {
        this.scanner = new Scanner(System.in);
    }
    
    public void mostrarMenu() {
        System.out.println("\n=== SISTEMA COOPERATIVA AGRO-TECNOLÓGICA ===");
        System.out.println("1. Listar todos los equipos");
        System.out.println("2. Buscar equipo por ID");
        System.out.println("3. Buscar equipo por nombre");
        System.out.println("4. Ordenar equipos por consumo eléctrico");
        System.out.println("5. Añadir nuevo equipo"); 
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    public int leerOpcion() {
        return scanner.nextInt();
    }
    
    public int leerID() {
        System.out.print("Ingrese ID del equipo: ");
        return scanner.nextInt();
    }
    
    public String leerNombre() {
        System.out.print("Ingrese nombre o parte del nombre: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
    
    public void mostrarEquipo(Equipos equipo, List<String> capacidades) {
        if (equipo != null) {
            System.out.println("=== INFORMACIÓN DEL EQUIPO ===");
            System.out.println(equipo.getInfo(true));
            
            System.out.println("Capacidades:");
            if (capacidades.isEmpty()) {
                System.out.println("- Este equipo no tiene capacidades específicas");
            } else {
                for (String capacidad : capacidades) {
                    System.out.println("- " + capacidad);
                }
            }
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }
    
    public void mostrarListaEquipos(List<Equipos> equipos) {
        System.out.println("\n=== LISTA DE EQUIPOS ===");
        if (equipos.isEmpty()) {
            System.out.println("No se encontraron equipos.");
        } else {
            for (int i = 0; i < equipos.size(); i++) {
                System.out.println((i + 1) + ". " + equipos.get(i).getInfo());
            }
            System.out.println("Total: " + equipos.size() + " equipos");
        }
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void mostrarError(String error) {
        System.out.println("ERROR: " + error);
    }
    
    public void limpiarBuffer() {
        scanner.nextLine();
    }
    
    public int leerTipoEquipo() {
        System.out.println("\n=== SELECCIONAR TIPO DE EQUIPO ===");
        System.out.println("1. Dron");
        System.out.println("2. Estación Meteorológica");
        System.out.println("3. Sensor");
        System.out.print("Seleccione el tipo: ");
        return scanner.nextInt();
    }
    
    public String leerAccionDron() {
        limpiarBuffer();
        System.out.print("Ingrese la acción del dron: ");
        return scanner.nextLine();
    }
    
    public String[] leerParametrosEstacion() {
        limpiarBuffer();
        System.out.print("Ingrese parámetros a medir: ");
        String entrada = scanner.nextLine();
        return entrada.split(",\\s*");
    }
    
    public String leerTipoMedicion() {
        limpiarBuffer();
        System.out.print("Ingrese tipo de medición: ");
        return scanner.nextLine();
    }
    
    public int leerNuevoID() {
        System.out.print("Ingrese ID del nuevo equipo: ");
        return scanner.nextInt();
    }
    
    public String leerNuevoNombre() {
        limpiarBuffer();
        System.out.print("Ingrese nombre del equipo: ");
        return scanner.nextLine();
    }
    
    public int leerNuevoConsumo() {
        System.out.print("Ingrese consumo eléctrico (W): ");
        return scanner.nextInt();
    }
}