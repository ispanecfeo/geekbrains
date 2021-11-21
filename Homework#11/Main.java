package avdeev.geekbrains;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] cities = {
                "Moscow",
                "Amsterdam",
                "Beijing",
                "Berlin",
                "Dublin",
                "Dublin",
                "Moscow",
                "Madrid",
                "Ottawa"
        };


        System.out.println("");
        System.out.println("Задание №1");
        System.out.println("Работа с массивом...");
        System.out.println("");

        String[] distrray = analyzeArray(cities);
        System.out.print("Массив с различными элементами: ");
        System.out.println(Arrays.toString(distrray));

        Map<String, Integer> repetitiveMap = repetitiveElements(cities);
        System.out.print("Повторяющиеся элементы: ");
        System.out.println(repetitiveMap);

        System.out.println("");
        System.out.println("Задание №2");
        System.out.println("Телефонная книга...");
        System.out.println("");

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Sara", "+1874548919");
        phoneBook.add("Sara", "+3897400990");
        phoneBook.add("Tom",  "+7978735614");
        phoneBook.add("Rita", "+7975789805");
        phoneBook.add("Nik",  "+5987123489");
        phoneBook.add("Mark", "+8938445783");
        phoneBook.add("Brad", "+1234908985");
        phoneBook.add("Tom",  "+3987482341s");

        System.out.println("Номер телефона Sara : " + phoneBook.get("Sara"));
        System.out.println("Номер телефона Rita : " + phoneBook.get("Rita"));
        System.out.println("Номер телефона Tom : "  + phoneBook.get("Tom"));

    }

    public static String[] analyzeArray(String[] arr) {

        Stream<String> stringStream = Arrays.stream(arr);
        return stringStream.distinct().toList().toArray(new String[0]);

    }

    public static Map<String, Integer> repetitiveElements(String[] sourceArr) {

        Map<String, Integer> repetitives = new HashMap<>();

        for (String val : sourceArr) {
            int current = repetitives.getOrDefault(val, 0);
            repetitives.put(val, current + 1);
        }

        return repetitives.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }


}
