package diablo_v1;

public class Sorcerer extends Character {
    public Sorcerer() {
        hp = 500;
        mp = 1000;

    }

    @Override
    void info() {
        System.out.println("체력 : "+hp+"\n마력 : "+mp);
    }
}
