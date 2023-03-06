package Homework.Units;

public class Peasant extends Hero {

    private int endurance;
    private int maxEndurance;

    public Peasant() {
        super(
                String.format("Hero_Peasant #%d", ++Peasant.number),
                150,
                Peasant.r.nextInt(1, 6),
                Peasant.r.nextInt(1, 4),
                Peasant.r.nextInt(1, 4));
        this.maxEndurance = Peasant.r.nextInt(80, 120);
        this.endurance = maxEndurance;
    }

    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }

}
