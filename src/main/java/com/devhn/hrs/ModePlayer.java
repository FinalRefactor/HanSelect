package com.devhn.hrs;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class ModePlayer {

    void play(HanSelectMode mode) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (mode == HanSelectMode.SHUFFLE) {
                System.out.println(Static.getString("message.require-shuffle-target"));

                String[] nameinput = scanner.nextLine().split(", ");

                System.out.println(Static.getString("message.shuffle-result"));

                List<String> list = new ArrayList<>(Arrays.asList(nameinput));
                Collections.shuffle(list);

                System.out.println(list);

            } else if (mode == HanSelectMode.SELECT) {
                System.out.println(Static.getString("message.require-select-target"));

                String[] nameinput = scanner.nextLine().split(", ");

                System.out.println(Static.getString("message.select-result"));

                System.out.printf(Static.getString("message.selected") + "\n", getRandArr(nameinput));

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
