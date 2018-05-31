package com.devhn.hrs;

class ModeDetector {
    void changeModeTo(String mode) {
        ModePlayer mp = new ModePlayer();

        if (Static.getString("mode.shuffle").equalsIgnoreCase(mode)) {
            mp.play(HanSelectMode.SHUFFLE);
        } else if (Static.getString("mode.select").equalsIgnoreCase(mode)) {
            mp.play(HanSelectMode.SELECT);
        } else {
            System.out.println(Static.formatError(2, "invalid-keyword"));
        }
    }
}
