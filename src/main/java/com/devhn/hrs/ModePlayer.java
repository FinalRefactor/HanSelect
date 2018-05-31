package com.devhn.hrs;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class ModePlayer {

    void play(HanSelectMode mode) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (mode == HanSelectMode.SHUFFLE) {
                System.out.println("섞을 이름을 입력하여 주세요. (이름은 ',' 콤마로 구분합니다.)");

                String[] nameinput = scanner.nextLine().split(", ");

                System.out.println("입력되었습니다. 다음은 섞기 결과입니다.");

                List<String> list = new ArrayList<>(Arrays.asList(nameinput));
                Collections.shuffle(list);

                System.out.println(list);

            } else if (mode == HanSelectMode.SELECT) {
                System.out.println("뽑을 이름을 입력하여 주세요. (이름은 ',' 콤마로 구분합니다.)");

                String[] nameinput = scanner.nextLine().split(", ");

                System.out.println("입력되었습니다. 다음은 뽑기 결과입니다.");

                System.out.println("뽑힌 사람: " + getRandArr(nameinput));

            }
        }
    }

    private static String getRandArr(String[] arr) {
        return arr[getRand(arr.length - 1)];
    }

    private static int getRand(int n) {
        return getRand(0, n);
    }

    private static int getRand(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("from must be smaller than to");
        } else if (from == to) {
            return to;
        } else {
            return ThreadLocalRandom.current().nextInt(to - from) + from;
        }
    }
}
