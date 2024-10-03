package lotr;
public class King extends Character {
    public King() {
        super((int)((Math.random() * (15 - 5)) + 5),(int)((Math.random() * (15 - 5)) + 5));
    }
    @Override
    public void kick(Character c){
        System.out.println("King kicked!");
        c.setHp(c.getHp() - (int)((Math.random() * (15 - 5)) + 5));
    }
}
