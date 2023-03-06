package Homework.Units;

public class Sniper extends Hero {
    
    private int shots;
    private int maxShots;

    public Sniper() {
        super(
                String.format("Hero_Sniper #%d", ++Sniper.number),
                200,
                Sniper.r.nextInt(1,10),
                Sniper.r.nextInt(1,5),
                Sniper.r.nextInt(4,7));
        this.maxShots = Sniper.r.nextInt(20,30);
        this.shots = maxShots;
    }

    public String getInfo() {
        return String.format("%s shots: %d", super.getInfo(), this.shots);
    }
}
