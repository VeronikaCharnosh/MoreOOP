package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("The opponents are " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName() );
        System.out.println("Fight starts");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(c1.getClass().getSimpleName() + " attacks " + c2.getClass().getSimpleName());
            c1.kick(c2);
            if (!c2.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " has been defeated!");
                break; 
            
            }
            System.out.println(c2.getClass().getSimpleName() + " attacks " + c1.getClass().getSimpleName());
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " has been defeated!");
                break; 
            }

        }
    }
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();

        System.out.println("Character 1: " + character1.getClass().getSimpleName() + " (HP: " + character1.getHp() + ", Power: " + character1.getPower() + ")");
        System.out.println("Character 2: " + character2.getClass().getSimpleName() + " (HP: " + character2.getHp() + ", Power: " + character2.getPower() + ")");

        fight(character1, character2);
    }
}
