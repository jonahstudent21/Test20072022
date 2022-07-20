package rpg.with.inheritance.example;

public class Hero extends LivingThing{
    private String name;

    public Hero(String name, int health, int attackDamage) {
        super("Human", health, attackDamage);
        this.name = name;
    }

    public String getName() {
        return name;
    } 
}