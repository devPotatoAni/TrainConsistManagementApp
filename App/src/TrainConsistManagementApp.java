import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC11 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("Input Validation using Regular Expressions (Regex)\n");

        String trainIdPatternString = "TRN-\\d{4}";
        String cargoCodePatternString = "PET-[A-Z]{2}";

        Pattern trainIdPattern = Pattern.compile(trainIdPatternString);
        Pattern cargoCodePattern = Pattern.compile(cargoCodePatternString);

        String[] testTrainIDs = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345"};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "PET-XYZ"};

        System.out.println("--- Validating Train IDs ---");
        for (String id : testTrainIDs) {
            Matcher matcher = trainIdPattern.matcher(id);
            if (matcher.matches()) {
                System.out.println("Train ID " + id + ": VALID");
            } else {
                System.out.println("Train ID " + id + ": INVALID (Format must be TRN-xxxx)");
            }
        }

        System.out.println("\n--- Validating Cargo Codes ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);
            if (matcher.matches()) {
                System.out.println("Cargo Code " + code + ": VALID");
            } else {
                System.out.println("Cargo Code " + code + ": INVALID (Format must be PET-XX)");
            }
        }
    }
}