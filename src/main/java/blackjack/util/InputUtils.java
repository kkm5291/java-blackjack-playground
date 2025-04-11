package blackjack.util;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);
    public static final String START_GAME_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";

    private InputUtils() {}

    private static String input() {
        return scanner.nextLine();
    }

    public static String inputPlayerName() {
        System.out.println(START_GAME_MESSAGE);
        return input();
    }
}
