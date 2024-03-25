public class Tecnico extends Operario{
    private int jornadaLaboralHs;
    public Tecnico() {
    }

    public Tecnico(String nombre, int dni, int jornadaLaboralHs) {
        super(nombre, dni);
        this.jornadaLaboralHs = jornadaLaboralHs;
    }
    public int getJornadaLaboralHs() {
        return jornadaLaboralHs;
    }

    public void setJornadaLaboralHs(int jornadaLaboralHs) {
        this.jornadaLaboralHs = jornadaLaboralHs;
    }

    public String toString(){
        String s = "nombre" +getNombre()+ ", dni: " +getDni()+ ", Horas jornada: " +getJornadaLaboralHs();
        return s;
    }

    public void conocerHsSemanales() {
        int hsSemanales = getJornadaLaboralHs()*5;
        System.out.println("El tecnico tiene "+hsSemanales+"hs de jornada laboral");
    }
}
