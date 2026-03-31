
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ALExttra {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "banana", "Mango");
        System.out.println(list);
        list.sort(new StringLengthComparator());
    }
}

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
