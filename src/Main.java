import java.util.*;

public class Main {
    public static void main(String[] args) {
       // getLengthOfStrings(new String[]{"this", "and", "that", "and"});
        createMap(new String[]{"man", "moon", "good", "night"});

    }
    //Task 1
    public static void getLengthOfStrings(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        for (String key : array) {
            map.put(key, key.length());
        }
        System.out.println(map);
    }

    //Task 2
    public static void createMap(String[] array) {
        Map<Character, Character> map = new HashMap<>();
        for (String key : array) {
            char ch = key.charAt(0);
            char ch2 = key.charAt(key.length()-1);
            map.put(ch, ch2);
        }
        System.out.println(map);
    }
}