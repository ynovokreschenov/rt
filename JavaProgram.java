import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;


public class JavaProgram {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.asList(1, 3, 4, 5, 1, 5, 4);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int key : list) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        
        System.out.println("list: " + list);
        System.out.println("map: " + map);
    }
}