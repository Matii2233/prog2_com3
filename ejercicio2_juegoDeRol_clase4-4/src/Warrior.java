public class Warrior extends BaseCharacter{
    public Warrior() {}
    public Warrior(String name, int health, int attack, int defense, int level) {
        super(name, health, attack, defense, level);
    }

    @Override
    public double toAttack(){
        System.out.println("El guerrero realizo un ataque");
        return getAttack()*1.15+getLevel()*1;
    }
    public void toDefend(double damage) {
        System.out.println("El guerrero recibio "+ (damage-getDefense()*0.5)+ " de daño");
    }
}
