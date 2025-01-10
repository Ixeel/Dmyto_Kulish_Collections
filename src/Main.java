import java.util.*;

public class Main {
    public static void main(String[] args) {
//       getLengthOfStrings(new String[]{"this", "and", "that", "and"});
//        createMap(new String[]{"man", "moon", "good", "night"});
//       countWords(new String[]{"c", "c", "c", "c"});
//        String[] strings = {"aa", "bb", "cc", "aAA", "cCC", "d"};
//    Map<String, String> result = mergeStringsByFirstChar(strings);
//       System.out.println(result);
//        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
//        List<Integer> myList = List.of(3, 1, 2, 3, 3, 3, 2, 3, 3);
//        System.out.println("Найчастіше зустрічається елемент: " + ListElements(myList));

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        System.out.println(LinkedHashSet(set,set2));
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
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        System.out.println(map);
    }

    //Task 4
    public static Map<String,String> mergeStringsByFirstChar(String[] array) {
        Map<String, String> map = new HashMap<>();
        for (String key : array) {
            char ch = key.charAt(0);
            String str = String.valueOf(ch);
            map.put(str, map.getOrDefault(str, "") + key);
        }
        return map;
    }

    //Task5
    public static String buildResultString(String[] array) {
        StringBuilder builder = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        // Рахуємо кількість входжень кожного рядка
        for (String key : array) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (String str : array) {
            // Додавання рядків до результату, якщо їх кількість парна
            if (map.get(str) % 2 == 0 && builder.indexOf(str) == -1) {
                builder.append(str);
            }
        }
        return builder.length() > 0 ? builder.toString() : "";
    }

    //Task 6
    public static Integer ListElements(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        // Перебір списку
        for (Integer num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Пошук елемента з максимальною кількістю повторень
        int count = 0;
        Integer frequentElement = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > count) {
                count = entry.getValue();
                frequentElement = entry.getKey();
            }
        }
        return frequentElement;
    }

    //Task 7
    public static boolean LinkedHashSet(LinkedHashSet<Integer> set, LinkedHashSet<Integer> set2) {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set2.add(3);
        set2.add(5);
        set2.add(6);

        for (Integer number : set) {
            for (Integer number2 : set2) {
                if (Objects.equals(number2, number)) {
                    return true;
                }
            }
        }
        return false;
    }
}



