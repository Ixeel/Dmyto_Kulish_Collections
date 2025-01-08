import java.util.*;

public class Main {
    public static void main(String[] args) {
       // getLengthOfStrings(new String[]{"this", "and", "that", "and"});
        //createMap(new String[]{"man", "moon", "good", "night"});
        //countWords(new String[]{"c", "c", "c", "c"});
        String[] strings = {"aa", "bb", "cc", "aAA", "cCC", "d"};
         Map<String, String> result = mergeStringsByFirstChar(strings);
        System.out.println(result);


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
    //Task 3
    public static void countWords(String[] array) {
        Map<String, Integer> map = new HashMap<>();
        for (String key : array) {
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        System.out.println(map);
    }

    //Task 4
    public static Map<String,String> mergeStringsByFirstChar(String[] array) {
        Map<String, String> map = new HashMap<>();
        for (String key : array) {
            char ch = key.charAt(0);
            String str = String.valueOf(ch);
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + key);
            }
            else {
                map.put(str, key);
            }
        }
        return map;
    }
}