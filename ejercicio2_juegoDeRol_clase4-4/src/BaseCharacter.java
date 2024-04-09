public abstract class BaseCharacter implements Character{
    private String name;
    private int health;
    private int attack;
    private int defense;
    private int level;

    public BaseCharacter() {}
    public BaseCharacter(String name, int health, int attack, int defense, int level) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.level = level;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}
    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}
    public int getDefense() {return defense;}
    public void setDefense(int defense) {this.defense = defense;}
    public int getLevel() {return level;}
    public void setLevel (int level) {this.level = level;}
}
