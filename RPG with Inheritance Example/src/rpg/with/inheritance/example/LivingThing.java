package rpg.with.inheritance.example;

public class LivingThing {
    private String species;
    private int health;
    private int attackDamage;

    public LivingThing(String species, int health, int attackDamage) {
        this.species = species;
        this.health = health;
        this.attackDamage = attackDamage;
    }

    public String getSpecies() {
        return species;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackDamage() {
        return attackDamage;
    } 
    
    public void damageHealth(int damage)
    {
        health -= damage;
    }
}