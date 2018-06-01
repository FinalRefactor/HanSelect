package com.devhn.hrs;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

final class ModePlayer {

    void play(@Nonnull HanSelectMode mode) {
        try (Scanner scanner = new Scanner(System.in)) {
            if (mode == HanSelectMode.SHUFFLE) {
                System.out.println(Static.getString("message.require-shuffle-target"));

                String[] nameInput = scanner.nextLine().split(",");

                System.out.println(Static.getString("message.shuffle-result"));

                List<String> list = new ArrayList<>(Arrays.asList(nameInput));
                Collections.shuffle(list);

                System.out.println(list);

            } else if (mode == HanSelectMode.SELECT) {
                System.out.println(Static.getString("message.require-select-target"));

                String[] nameInput = scanner.nextLine().split(",");

                System.out.println(Static.getString("message.select-result"));

                System.out.printf(Static.getString("message.selected") + "\n", getRandArr(nameInput));

            }
        }
    }

    private static String getRandArr(@Nonnull String[] arr) {
        return arr[getRand(arr.length - 1)];
    }

    private static int getRand(int n) {
        return ThreadLocalRandom.current().nextInt(n);
    }
}
