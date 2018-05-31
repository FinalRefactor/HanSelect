package com.devhn.hrs;

class ModeDetector {
    void changeModeTo(String mode) {
        ModePlayer mp = new ModePlayer();

        if (Static.getString("mode.shuffle").equalsIgnoreCase(mode)) {
            Util.MODE = HanSelectMode.SHUFFLE;
            mp.play(Util.MODE);
        } else if (Static.getString("mode.select").equalsIgnoreCase(mode)) {
            Util.MODE = HanSelectMode.SELECT;
            mp.play(Util.MODE);
        } else {
            System.out.println(Static.formatError(2, "invalid-keyword"));
        }
    }
}
