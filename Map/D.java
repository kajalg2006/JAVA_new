package Map;

import java.util.HashMap;

public class D {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("id0", 2);
        map.put("id1", 1);
        map.put("id2", 3);
        System.out.println(map);
        System.out.println(map.containsKey("id0"));
        System.out.println(map.containsValue(1));
        // System.out.println(map.remove(map));

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
