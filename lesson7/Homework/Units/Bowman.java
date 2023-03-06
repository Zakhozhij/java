package Homework.Units;

public class Bowman extends Sniper {

    public Bowman() {
        super.name= String.format("Hero_Bowman #%d", Bowman.number);
    }

    public String getInfo() {
        return String.format("%s", super.getInfo());
    }
}
