package org.example.core;

import org.example.StringUtils;

import java.util.Arrays;

public class Utils {

    private Utils() {}

    public static boolean isAllPositiveNumbers(String... str) {
        if ((str == null) || (str.length == 0)) {
            throw new UnsupportedOperationException("There must be at least one argument and it cannot be null");
        }
        String arrayString = Arrays.toString(str).replace("[", "").replace("]", "");
        System.out.println("Running org.example.core.Utils.isAllPositiveNumbers(" + arrayString + ")");
        for (String s : str) {
            if (!StringUtils.isPositiveNumber(s)) {
                return false;
            }
        }
        return true;
    }
}
