import java.util.*;

public class hashing4 {
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();

        // Reverse the mapping
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }

        // Find the starting point (which is not present in the reverse map)
        for (String key : tick.keySet()) {
            if (!revMap.containsKey(key)) {
                return key;
            }
        }
        return null; // In case no valid start point is found
    }

    public static void main(String args[]) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        // Finding the starting location
        String start = getStart(tickets);
        System.out.println( start);
    }
}