package com.devhn.hrs;

import com.joconner.i18n.Utf8ResourceBundleControl;

import javax.annotation.Nonnull;
import java.util.ResourceBundle;

final class Static {
    private Static() {
        throw new UnsupportedOperationException("You cannot instantiate Static");
    }


    private static final ResourceBundle bundle = ResourceBundle.getBundle("lang", new Utf8ResourceBundleControl(false));

    static String getString(@Nonnull String key) {
        return bundle.getString(key);
    }

    static String formatError(int code, @Nonnull String id) {
        return String.format(getString("error.prefix"), code) + " - " + getString("error." + id);
    }
}
