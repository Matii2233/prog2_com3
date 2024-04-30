
public class Main {
    public static void main(String[] args) {
        Athlete at1 = new Athlete(111,"Norberto",1.87,27,85.6);
        Athlete at2 = new Athlete(112,"Alejandro",1.76,23,78.7);
        Athlete at3 = new Athlete(113,"Romina",1.65,20,60.5);

        Trial t1 = new Trial(1, "Carrera de 100 metros", at1);
        Trial t2 = new Trial(2, "Carrera de 200 metros", at2);
        Trial t3 = new Trial(3, "Carrera de 250 metros", at3);

        NationalTeam nt1 = new NationalTeam("Rojo", "Canada");

        Instalation i1 = new Instalation
                ("Mayor", "New York", "Gremio de Atletismo y Gimnasia", "Internacional");

        Headquarters h1 = new Headquarters(10,"21/10/2024","09:00",i1, t1);


        // Asignaciones
        // atletas a los equipos nacionales
        nt1.setAthlete(at1);
        nt1.setAthlete(at2);
        nt1.setAthlete(at3);


        // atletas a las pruebas
        t1.setAthlete(at2);
        t1.setAthlete(at3);
        t2.setAthlete(at1);
        t2.setAthlete(at3);
        t3.setAthlete(at1);
        t3.setAthlete(at2);

        // la sede a las pruebas
        t1.setHeadquarters(h1);
        t2.setHeadquarters(h1);
        t3.setHeadquarters(h1);

        // la sede a la instalacion
        i1.setHeadquarters(h1);

        // las pruebas a la sede
        h1.setTrials(t2);
        h1.setTrials(t3);


        // El tercer atleta de la segunda prueba desde las instalaciones
        System.out.println();
        System.out.println("Tercer atleta de la segunda prueba de la instalacion " +i1.getName());
        for (Trial t : i1.getHeadquarters().getTrials()) {
            if (t.getCode() == 2) {
                for (Athlete a : t.getAthletes()) {
                    if (a.getIdn()==113) {
                        System.out.println("  " +a.getName());
                    }
                }
            }
        }


        // Altura y si excede, o no el peso, cada atleta de un equipo nacional
        System.out.println();
        System.out.println("Altura y exceso, o no de peso, de los atletas del equipo nacional de " +nt1.getCountry());
        for (Athlete a : nt1.getAthletes()) {
            if (a.thereIsExcessWeight(a.calculateIMC())) {
                System.out.println("  " +a.getName()+ ": " +a.getHeight()+ ", Excede el peso");
            } else {
                System.out.println("  " +a.getName()+ ": " +a.getHeight()+ ", No excede el peso");
            }
        }
    }
}