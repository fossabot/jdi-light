package com.epam.jdi.light.common;

import static java.lang.String.format;

/**
 * Created by Roman_Iovlev on 3/19/2018.
 */
public class Exceptions {
    public static RuntimeException exception(String msg, Object... args) {
        return new RuntimeException(format(msg, args));
    }
}