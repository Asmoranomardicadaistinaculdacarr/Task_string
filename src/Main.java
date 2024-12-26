import java.util.ArrayList;
import java.util.Collections;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void add(String str) {
        strings.add(str);
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null; 
        }
        return Collections.max(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0; 
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
}

public class Main {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();

        stringArray.add("Hello");
        stringArray.add("World");

        String maxLengthString = stringArray.getMaxLengthString();
        System.out.println("Max length string: " + maxLengthString);

        double averageLength = stringArray.getAverageLength();
        System.out.println("Average length: " + averageLength);
    }
}
