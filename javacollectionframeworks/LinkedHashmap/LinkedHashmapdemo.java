
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashmapdemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>(11, 0.3f, true);

        map1.put("Shubham", 90);
        map1.put("Neha", 92);
        map1.get("Shubham");

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // HashMap<String, Integer> map1 = new HashMap<>();
        // map1.put("Shubham", 90);
        // map1.put("Neha", 92);

        // for (HashMap.Entry<String, Integer> entry : map1.entrySet()) {
        // System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
    }

}