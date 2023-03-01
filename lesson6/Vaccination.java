import java.time.LocalDate;

public class Vaccination {
    private String name;
    private LocalDate date;
    private String producer;

    public Vaccination(String name, LocalDate date, String producer) {
        this.name = name;
        this.date = date;
        this.producer = producer;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Vaccination [name=" + name + ", date=" + date + ", producer=" + producer + "]";
    }

    
}
