package cn.law.express.android.common;

import android.text.TextUtils;

import androidx.annotation.Nullable;

import java.util.Collection;

public final class CollectionUtils {

    private CollectionUtils() {
        throw new IllegalArgumentException("");
    }

    public static boolean isEmpty(@Nullable Collection c) {
        return c == null || c.isEmpty();
    }


}
