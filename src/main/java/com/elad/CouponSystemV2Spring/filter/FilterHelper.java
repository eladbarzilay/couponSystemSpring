package com.elad.CouponSystemV2Spring.filter;

public class FilterHelper {

    public static String getType(String url) {
        String[] step1 = url.split("/");
        return step1[2].toLowerCase();
    }
}