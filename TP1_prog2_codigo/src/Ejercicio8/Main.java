package Ejercicio8;

public class Main {
    public static void main(String[] args){
        Manager m1 = new Manager(46, "Sergio", 2000000, true, "Market products");
        Staff s1 = new Staff(27, "Laura", 700000, true, "Market products");
        String objet;

        m1.showInfo();
        System.out.println();
        s1.showInfo();

        System.out.println();
        objet=m1.dictateNewActivities();
        s1.toProduce(objet);
    }
}
