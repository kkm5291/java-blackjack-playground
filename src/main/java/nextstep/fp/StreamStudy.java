package nextstep.fp;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamStudy {

    public static long countWords() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        return words.stream()
                .filter(w -> w.length() > 12)
                .count();
    }

    /**
     * 단어의 길이가 12자를 초과하는 단어를 추출한다.
     * 12자가 넘는 단어 중 길이가 긴 순서로 100개의 단어를 추출한다.
     * 단어 중복을 허용하지 않는다. 즉, 서로 다른 단어 100개를 추출해야 한다.
     * 추출한 100개의 단어를 출력한다. 모든 단어는 소문자로 출력해야 한다.
     * @throws IOException
     */
    public static void printLongestWordTop100() throws IOException {
        String contents = new String(Files.readAllBytes(Paths
                .get("src/main/resources/fp/war-and-peace.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(contents.split("[\\P{L}]+"));

        words.stream()
                .filter(w -> w.length() > 12)
                .distinct()
                .sorted((w1, w2) -> w2.length() - w1.length())
                .limit(100)
                .forEach(System.out::println);
    }

    public static List<Integer> doubleNumbers(List<Integer> numbers) {
        return numbers.stream().map(x -> 2 * x).collect(Collectors.toList());
    }

    public static long sumAll(List<Integer> numbers) {
        return numbers.stream().reduce(0, Integer::sum);
    }

    /**
     * List에 담긴 모든 숫자 중 3보다 큰 숫자를 2배 한 후 모든 값의 합을 구한다. 지금까지 학습한 map, reduce, filter를 활용해 구현해야 한다.
     * @param numbers
     * @return
     */
    public static long sumOverThreeAndDouble(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n > 3)
                .map(n -> 2 * n)
                .reduce(0, Integer::sum);
    }
}