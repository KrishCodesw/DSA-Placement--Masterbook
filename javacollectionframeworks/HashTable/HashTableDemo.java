
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        /*
         * Hashtable<Integer, String> hashtable = new Hashtable<>();
         * // Hashtable is synchronized
         * // no null key or value
         * // Legacy Class, ConcurrentHashMap
         * // slower than HashMap
         * // only linked list in case of collision
         * // all methods are synchronized
         * hashtable.put(1, "Apple");
         * hashtable.put(2, "Banana");
         * hashtable.put(3, "Cherry");
         * System.out.println(hashtable);
         * System.out.println("Value for key 2: " + hashtable.get(2));
         * System.out.println("Does key 3 exist? " + hashtable.containsKey(3));
         * hashtable.remove(1);
         * System.out.println("After removing key 1: " + hashtable);
         * // hashtable.put(null, "value"); // Throws exception
         * // hashtable.put(4, null); // Throws exception
         */

        Hashtable<Integer, String> map = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap: " + map.size());

    }
}