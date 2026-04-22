import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class ImmutableMapDemo {
    Map<String, String> mutableMap = new HashMap<>();

    mutableMap.put("USA","North America");

Map<String, String> unmodifiableMap = Collections.unmodifiableMap(mutableMap);

assertThrows(UnsupportedOperationException.class,() ->unmodifiableMap.put("Canada", "North America"));
  
}
