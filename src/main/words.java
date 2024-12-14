import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class words {
    public static void main(String[]
                                    args) {
        String filename = "C:\\Users\\User\\IdeaProjects\\lesson1\\src\\main\\text2.txt"; // word
        analyzeFile(filename);

    }

    private static void
    analyzeFile(String filename) {
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("W+"); // Разбиваем строку по не буквенным символам
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word =
                                word.toLowerCase(); // Приводим к нижнему регистру для точности

                        wordCounts.put(word,
                                wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Сортировка слов в алфавитном порядке
        List<String> sortedWords = new ArrayList<>(wordCounts.keySet());
        Collections.sort(sortedWords);

        // Вывод слов и их частоты
        System.out.println("Слова в алфавитном порядке и их частота:");
        for (String word : sortedWords) {
            System.out.println(word + ":" + wordCounts.get(word));
        }

        // Нахождение слова с максимальной частотой
        String mostCommonWord = null;
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostCommonWord =
                        entry.getKey();
            }
        }
        System.out.println("nСлово, встречающееся максимальное число раз: '" + mostCommonWord + "' (частота: " + maxFrequency + ")");
    }
}