public class Laptop {
    private Integer inventary;
    private String name;
    private String oS;
    private String color;
    private Integer hardDiskSize;
    private Integer rAM;
    private Double price;

    public Laptop(Integer inventary, String name, String oS, String color, Integer hardDiskSize, Integer rAM,
            Double price) {
        this.inventary = inventary;
        this.name = name;
        this.oS = oS;
        this.color = color;
        this.hardDiskSize = hardDiskSize;
        this.rAM = rAM;
        this.price = price;
    }

    public Integer getInventary() {
        return inventary;
    }

    public String getName() {
        return name;
    }

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public String getColor() {
        return color;
    }

    public Integer getHardDiskSize() {
        return hardDiskSize;
    }

    public Integer getrAM() {
        return rAM;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop [inventary=" + inventary + ", name=" + name + ", oS=" + oS + ", color=" + color
                + ", hardDiskSize=" + hardDiskSize + ", rAM=" + rAM + ", price=" + price + "]";
    }

    

}
