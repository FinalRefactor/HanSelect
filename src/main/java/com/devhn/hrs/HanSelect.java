package com.devhn.hrs;

import java.util.Scanner;

public final class HanSelect {
    public static void main(String[] args) {
        ModeDetector md = new ModeDetector();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(Static.getString("message.title") + " - DevHN");
            System.out.println(Static.getString("message.select-keyword"));
            System.out.printf("%s / %s\n", Static.getString("mode.shuffle"), Static.getString("mode.select"));

            String input = scanner.nextLine();
            md.changeModeTo(input);
        }
    }
}
