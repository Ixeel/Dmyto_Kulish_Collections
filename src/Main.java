import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,14,15,92,6));
        for (int i: numbers)
            System.out.println(i);

        ArrayList<String> string = new ArrayList<>(Arrays.asList("Дмитро", "Куліш", "Володимирович"));
        for (String i: string)
            System.out.println(i);

        HashSet<Integer> numbersHashSet = new HashSet<Integer>();
        numbersHashSet.add(1);
        numbersHashSet.add(2);
        numbersHashSet.add(3);
        // дублікат
        numbersHashSet.add(1);
        System.out.println(numbersHashSet);


        HashMap<String, String> ukrainianCitiesAndNumbers = new HashMap<>();
        ukrainianCitiesAndNumbers.put("Харків","057");
        ukrainianCitiesAndNumbers.put("Вінниця", "0432");
        ukrainianCitiesAndNumbers.put("Київ", "044");
        System.out.println(ukrainianCitiesAndNumbers);
    }

}