import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckSome {
    public static void main(String[] args) {
        /*List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );

        Stream<String> word1 = sentenceList.stream()
                .flatMap(sentence -> sentence.stream());

        Stream<String> word2 = sentenceList.stream()
                .flatMap(sentence -> sentence.stream().map(s -> s.toLowerCase()));

        word1.forEach(s -> System.out.println(s));
        word2.forEach(s -> System.out.println(s));*/

        List<Integer> num = Arrays.asList(1, 2, 3, 4);
        Stream<Integer> numStream = num.stream().filter(integer -> integer>2).
                peek(integer -> System.out.println(integer));
        numStream.count();
    }
}
