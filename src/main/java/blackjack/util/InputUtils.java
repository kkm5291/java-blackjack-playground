package blackjack.util;

import blackjack.domain.person.Players;

import java.util.Scanner;

public class InputUtils {

    private static final Scanner scanner = new Scanner(System.in);
    public static final String START_GAME_MESSAGE = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
    public static final String BETTING_MESSAGE = "의 배팅 금액은?";
    public static final String INIT_DIVIDE_CARD_MESSAGE = "딜러와 %s에게 2장을 나누었습니다.";


    private InputUtils() {}

    public static String[] splitInput(String input) {
        return input.split(",");
    }

    public static String[] inputPlayersName() {
        System.out.println(START_GAME_MESSAGE);
        return splitInput(input());
    }

    public static int inputPlayerBet(String playerName) {
        System.out.println(playerName + BETTING_MESSAGE);
        return Integer.parseInt(input());
    }

    public static void initPrintCardInfo(Players players) {
        System.out.printf((INIT_DIVIDE_CARD_MESSAGE) + "%n", players.getPlayerNames());
    }

    private static String input() {
        return scanner.nextLine();
    }
}
