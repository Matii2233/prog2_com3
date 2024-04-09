
public class Main {
    public static void main(String[] args) {
        Mage m1 = new Mage("Geralt", 1500, 500, 200, 95);
        Warrior w1 = new Warrior("Stark", 2500, 400, 400, 95);
        Rogue r1 = new Rogue("Altair", 2000, 450, 300, 95);
        double damage;

        damage = r1.toAttack();
        System.out.println("El picaro ataco al gerrero");
        w1.toDefend(damage);
        System.out.println();

        damage = m1.toAttack();
        System.out.println("El mago ataco al gerrero");
        w1.toDefend(damage);
        System.out.println();

        damage = r1.toAttack();
        System.out.println("El picaro ataco al mago");
        m1.toDefend(damage);
        System.out.println();
    }
}