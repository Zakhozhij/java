package Homework.Units;

public class Spearman extends Hero{
    private int endurance;
    private int maxEndurance;

    public Spearman() {
        super(
                String.format("Hero_Spearman #%d", ++Spearman.number),
                150,
                Spearman.r.nextInt(1, 6),
                Spearman.r.nextInt(1, 4),
                Spearman.r.nextInt(1, 4));
        this.maxEndurance = Spearman.r.nextInt(80, 120);
        this.endurance = maxEndurance;
    }

    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }
}
