package com.epam.utils;

public class StringUtils {
    private StringUtils(){}
    public static boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}
