package lotr;
public class Knight extends Character {
    public Knight() {
        super((int)((Math.random() * (12 - 2)) + 2),(int)((Math.random() * (12 - 2)) + 2));
    }
    @Override
    public void kick(Character c){
        System.out.println("Knight kicked!");
        c.setHp(c.getHp() - (int)((Math.random() * (12 - 2)) + 2));
    }
}
