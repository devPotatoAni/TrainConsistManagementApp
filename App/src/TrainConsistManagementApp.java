import java.util.ArrayList;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " (" + capacity + " seats)";
    }
}

public class UC10CountTotalSeats {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Calculating Total Seating Capacity using map() and reduce()\n");

        List<Bogie> trainFormation = new ArrayList<>();
        trainFormation.add(new Bogie("Sleeper", 72));
        trainFormation.add(new Bogie("AC Chair", 56));
        trainFormation.add(new Bogie("Sleeper", 72));
        trainFormation.add(new Bogie("First Class", 24));
        trainFormation.add(new Bogie("General", 90));

        System.out.println("Train Composition:");
        trainFormation.forEach(System.out::println);


        int totalSeats = trainFormation.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        System.out.println("\n-------------------------------------");
        System.out.println("Total Seating Capacity: " + totalSeats);
        System.out.println("-------------------------------------");


        System.out.println("Verification: Original bogie count remains " + trainFormation.size());
    }
}