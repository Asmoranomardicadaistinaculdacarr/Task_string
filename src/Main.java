import java.util.ArrayList;
import java.util.Collections;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    // Метод для добавления строки и сортировки массива
    public void add(String str) {
        strings.add(str);
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    // Метод для получения строки максимальной длины
    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null; // Если массив пуст, возвращаем null
        }
        return Collections.max(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    // Метод для вычисления средней длины строк
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0; // Если массив пуст, возвращаем 0
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
}

// Тестирование класса StringArray
public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();

        // Добавление строк
        stringArray.add("Hello");
        stringArray.add("World");
        stringArray.add("Java");
        stringArray.add("Programming");
        stringArray.add("AI");

        // Получение строки максимальной длины
        String maxLengthString = stringArray.getMaxLengthString();
        System.out.println("Max length string: " + maxLengthString);

        // Вычисление средней длины строк
        double averageLength = stringArray.getAverageLength();
        System.out.println("Average length: " + averageLength);
    }
}
