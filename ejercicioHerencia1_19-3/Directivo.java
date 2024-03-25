public class Directivo extends Empleado {
    private int numDepartamento;
    public Directivo() {
    }
    public Directivo(String nombre, int numDepartamento) {
        super(nombre);
        this.numDepartamento = numDepartamento;
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public String toString() {
        String s = "nombre" +getNombre()+ ", departamento nro: " +getNumDepartamento();
        return s;
    }

    public void isPromoved() {
        if (getNumDepartamento() > 1999){
            System.out.println("El directivo fue promovido");
        } else {
            System.out.println("El directivo no fue promovido");
        }
    }
}
