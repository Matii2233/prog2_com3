// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Operario op1 = new Operario("Marcelo", 4435625);
        Oficial of1 = new Oficial("Reinaldo", 4453635, 7);
        Tecnico t1 = new Tecnico("Pedro", 4446353, 8);
        Directivo d1 = new Directivo("Josue", 2234);

        System.out.println(op1.toString());
        System.out.println(of1.toString());
        System.out.println(t1.toString());
        System.out.println(d1.toString());

        of1.conocerHsSemanales();
        t1.conocerHsSemanales();
        d1.isPromoved();
    }
}