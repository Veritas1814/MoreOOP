package lotr;
public class Elf extends Character {
    public Elf() {
        super(10,10);
    }
    @Override
    public void kick(Character c){
        System.out.println("Elf kicked!");
        if(c.getHp()<this.getHp()&c.getPower()<this.getPower()){
            c.setHp(0);
        }
        else {setPower(this.getPower()-1);}
    }
}
