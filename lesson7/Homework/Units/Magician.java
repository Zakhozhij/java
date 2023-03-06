package Homework.Units;

public class Magician extends Hero {

    private int mana;
    private int maxMana;

    public Magician() {
        super(
                String.format("Hero_Magician #%d", ++Magician.number),
                170,
                Magician.r.nextInt(1,11),
                Magician.r.nextInt(4,7),
                Magician.r.nextInt(1,5));
        this.maxMana = Magician.r.nextInt(120,150);
        this.mana = maxMana;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}