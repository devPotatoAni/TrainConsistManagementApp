import java.util.LinkedHashMap;
import java.util.Map;

public class UC6MapBogietoCapacity {

    public static void main(String[] args) {

        System.out.println("=== Bogie Capacity Management App ===");

        Map<String, Integer> bogieCapacities = new LinkedHashMap<>();

        bogieCapacities.put("Engine", 0);
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("Cargo", 100);
        bogieCapacities.put("Guard", 10);

        bogieCapacities.put("Sleeper", 80);

        System.out.println("Final Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}