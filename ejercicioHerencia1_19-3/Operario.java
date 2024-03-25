public class Operario extends Empleado{
    private int dni;
    public Operario() {
    }

    public Operario(String nombre, int dni) {
        super(nombre);
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String toString() {
        String s = "nombre: " +getNombre()+ ", dni: " +getDni();
        return s;
    }
}
