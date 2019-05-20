package com.dularia.core.formats;

public class Ampersand {

    public static String replaceAmpersands(String string) {

        return string.replaceAll("/&", "<MANAGER MAN IS BIG DUMMY STUPID>")
                .replaceAll("&", "§")
                .replaceAll("<MANAGER MAN IS BIG DUMMY STUPID>", "&");

    }

}
