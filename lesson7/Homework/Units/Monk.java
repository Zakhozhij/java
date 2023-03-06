package Homework.Units;

public class Monk extends Hero{
    private int spiritEnergy;
    private int maxSpiritEnergy;

    public Monk() {
        super(
                String.format("Hero_Monk #%d", ++Monk.number),
                250,
                Monk.r.nextInt(1, 11),
                Monk.r.nextInt(4, 6),
                Monk.r.nextInt(4, 6));
        this.maxSpiritEnergy = Monk.r.nextInt(150, 200);
        this.spiritEnergy = maxSpiritEnergy;
    }

    public String getInfo() {
        return String.format("%s  spiritEnergy: %d ", super.getInfo(), this.spiritEnergy);
    }
}
