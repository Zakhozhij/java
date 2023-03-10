package Homework.Units;

public class Robber extends Hero {

    private int endurance;
    private int maxEndurance;

    public Robber() {
        super(
                String.format("Hero_Robber #%d", ++Robber.number),
                300,
                Robber.r.nextInt(1,11),
                Robber.r.nextInt(1,5),
                Robber.r.nextInt(4,7));
        this.maxEndurance = Robber.r.nextInt(120,150);
        this.endurance = maxEndurance;
    }

    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }
}