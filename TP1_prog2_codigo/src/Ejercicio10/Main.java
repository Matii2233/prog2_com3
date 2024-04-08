package Ejercicio10;

public class Main {
    public static void main(String[] args){
        Novel n1 = new Novel("Carlos Galardini", "La sombra de la montaña", 25599, "Aventuras");

        TextBook tb1 = new TextBook("Jorge Mankiwi", "Principles of Economics", 100000, "EconomiaIII");

        TextBookFromCNU cnu1 = new TextBookFromCNU("Emilia Giliartar", "El principio de la ley", 35000,
                                                   "Leyes", "facultad de derecho de bogota");

        n1.showInfo();
        System.out.println();
        tb1.showInfo();
        System.out.println();
        cnu1.showInfo();
    }
}
