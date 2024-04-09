public class Mage extends BaseCharacter{
    public Mage() {}
    public Mage(String name, int health, int attack, int defense, int level) {
        super(name, health, attack, defense, level);
    }

    @Override
    public double toAttack(){
        System.out.println("El mago realizo un ataque");
        return getAttack()*1.5+getLevel()*3;
    }
    public void toDefend(double damage) {
        System.out.println("El mago recibio "+ (damage-getDefense()*0.25)+ " de daño");
    }
}
