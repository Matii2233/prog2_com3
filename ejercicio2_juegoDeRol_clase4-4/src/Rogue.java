public class Rogue extends BaseCharacter{
    public Rogue() {}
    public Rogue(String name, int health, int attack, int defense, int level) {
        super(name, health, attack, defense, level);
    }

    @Override
    public double toAttack(){
        System.out.println("El picaro realizo un ataque");
        return getAttack()*1.25+getLevel()*2;
    }
    public void toDefend(double damage) {
        System.out.println("El picaro recibio "+ (damage-getDefense()*0.35) +" de daño");
    }
}
