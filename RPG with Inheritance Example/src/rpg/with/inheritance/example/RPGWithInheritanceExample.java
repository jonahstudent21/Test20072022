package rpg.with.inheritance.example;

public class RPGWithInheritanceExample {

    public static void main(String[] args) {
        Hero bob = new Hero("Bob", 100, 10);
        Hero jane = new Hero("Jane", 120, 5);
        
        System.out.println(
                            "\nHero name:\t" + bob.getName() +
                            "\nHero species:\t" + bob.getSpecies() +
                            "\nHero health:\t" + bob.getHealth() +
                            "\nHero damage:\t" + bob.getAttackDamage());
        
        bob.damageHealth(jane.getAttackDamage());
        
        System.out.println("Bob health after attack " + bob.getHealth());
     
        }             
}
