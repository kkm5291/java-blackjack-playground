package nextstep.fp;

import java.util.List;
import java.util.concurrent.locks.Condition;

/**
 * 변경되는 부분과 변경되지 않는 부분의 코드를 분리한다.
 * 변경되는 부분은 인터페이스로 추출한다.
 * 인터페이스에 대한 구현체를 익명 클래스로 구현해 메소드의 인자로 전달한다.
 *
 * 3가지 메서드에 대해서 공통 부분 (변경 되지 않는 부분)
 * int total = 0;
 * for (int number : numbers) {
 *     // 조건 검사 또는 누적
 * }
 * return total;
 *
 * 공통되지 않는 부분 (변경 되는 부분)
 * 조건 검사 또는 누적 부분
 */
public class Lambda {
    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAll(List<Integer> numbers) {
        return calc(numbers, number -> true);
    }

    public static int sumAllEven(List<Integer> numbers) {
        return calc(numbers, number -> number % 2 == 0);
    }

    public static int sumAllOverThree(List<Integer> numbers) {
        return calc(numbers, number -> number > 3);
    }

    private static int calc(List<Integer> numbers, Conditional conditional) {
        return numbers.stream()
                .filter(conditional::test)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
