import java.util.*;

public class Main {
    public static void main(String[] args) {
        getLengthOfStrings(new String[]{"this", "and", "that", "and"});

    }
    //Task 1
    public static void getLengthOfStrings(String[] getLengthOfStrings) {
        Map<String, Integer> map = new HashMap<>();
        for (String key : getLengthOfStrings) {
            map.put(key, key.length());
        }
        System.out.println(map);
    }
}