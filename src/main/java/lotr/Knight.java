package lotr;

import java.util.Random;

import kick.KnightStrategy;


public class Knight extends Character {
    public Knight() {
        super(new Random().nextInt(11) + 2, new Random().nextInt(11) + 2, new KnightStrategy());
    }
}