package kick;
import lotr.Character;

public class Kill implements KickStrategy{
    @Override
    public void kick(Character whoKick, Character opponent){
        if (opponent.getPower() < whoKick.getPower()){
        opponent.setHp(opponent.getHp());
        whoKick.setPower(1);}
    }
}
