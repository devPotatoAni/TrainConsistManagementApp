import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return "Bogie{name='" + name + "', capacity=" + capacity + "}";
    }
}

public class UC9GroupBogiesByType {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Grouping Bogies by Type using Collectors.groupingBy()\n");

        List<Bogie> trainFormation = new ArrayList<>();
        trainFormation.add(new Bogie("Sleeper", 72));
        trainFormation.add(new Bogie("AC Chair", 56));
        trainFormation.add(new Bogie("Sleeper", 72));
        trainFormation.add(new Bogie("First Class", 24));
        trainFormation.add(new Bogie("AC Chair", 56));
        trainFormation.add(new Bogie("General", 90));

        System.out.println("All Bogies in Train:");
        trainFormation.forEach(System.out::println);

        Map<String, List<Bogie>> groupedBogies = trainFormation.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        System.out.println("\nGrouped Bogie Structure:");
        groupedBogies.forEach((type, list) -> {
            System.out.println(type + ": " + list);
        });

        System.out.println("\nVerification: Total unique categories identified: " + groupedBogies.size());
    }
}