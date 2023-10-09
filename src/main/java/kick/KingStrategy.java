package kick;
import java.util.Random;

import lotr.Character;

public class KingStrategy implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character opponent){
        Random rand = new Random();
        int damage = rand.nextInt(whoKick.getPower()) + 1;
        opponent.setHp(damage);
    }    
}
