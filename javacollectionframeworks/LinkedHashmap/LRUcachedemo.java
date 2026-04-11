
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcachedemo<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    public LRUcachedemo(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        // LRUcachedemo<String, Integer> studentMap = new LRUcachedemo<>(3);
        // studentMap.put("Keshav", 99);
        // studentMap.put("Kirat", 72);
        // studentMap.put("Ram", 98);
        // System.out.println(studentMap);

        // OUTPUT -- {Keshav=99, Kirat=72, Ram=98} THE GOOD OG OUTPUT OF LHM

        // LRUcachedemo<String, Integer> studentMap = new LRUcachedemo<>(3);
        // studentMap.put("Keshav", 99);
        // studentMap.put("Kirat", 72);
        // studentMap.put("Ram", 98);
        // studentMap.put("Kishan", 988);
        // System.out.println(studentMap);

        // OUTPUT -- {Kirat=72, Ram=98, Kishan=988}

        // LRUcachedemo<String, Integer> studentMap = new LRUcachedemo<>(3);
        // studentMap.put("Keshav", 99);
        // studentMap.put("Kirat", 72);
        // studentMap.put("Keshav", 988);
        // studentMap.put("Ram", 98);
        // System.out.println(studentMap);
        // OUTPUT --{Kirat=72, Keshav=988, Ram=98}
    }

}
