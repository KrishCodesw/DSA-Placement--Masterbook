import java.util.HashMap;

public class IdentityHashmapdemo {
    public static void main(String[] args) {
        String Key1 = new String("key"); // iska address alag
        String Key2 = new String("key"); // iska address bhi alag

        HashMap<String, Integer> map = new HashMap<>();
        map.put(Key1, 1); // key,1
        map.put(Key2, 2); // key,2
        // Equal nahi hai toh collision aayega and agar equal hai toh replace hojeaga
        // Equal will be checked with equals() method se
        System.out.println(Key1.equals(Key2));
        
        System.out.println(map);
    }
}
