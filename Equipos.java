public abstract class Equipos{
    protected int ID;
    protected String nombre;
    protected int consumo;   

    public Equipos(int ID, String nombre, int consumo)
    {
        this.nombre = nombre;
        this.consumo = consumo;
        this.ID = ID;
    }
    public String getInfo() {
        return "ID: " + ID + ", Nombre: " + nombre + ", Consumo: " + consumo + "W";
    }
    public String getInfo(boolean detallada) {
        if (detallada) {
            return getInfo() + ", Tipo: " + this.getClass().getSimpleName();
        }
        return getInfo();
    }

    public String getNombre()
    {
        return nombre;
    }
    public int getID()
    {
        return ID;
    }
    public int getConsumo()
    {
        return consumo;
    }
}
