import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class WordCount {
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> result = new HashMap<>();

        Arrays.stream(input.toLowerCase().split("\\W+"))
              .forEach(word ->
                  result.put(word, result.getOrDefault(word, 0) + 1)
              );

        return result;
    }
}
