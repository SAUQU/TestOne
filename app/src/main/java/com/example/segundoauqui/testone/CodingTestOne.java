package com.example.segundoauqui.testone;

import static java.lang.System.in;

/**
 * Created by segundoauqui on 8/8/17.
 */

public class CodingTestOne {


    public static boolean Polindrom(char[] word) {

        int a = 0;
        int b = word.length - 1;
        while (b > a) {
            if (word[a] != word[b]) {
                return false;
            }
            ++a;
            --b;
        }
        return true;
    }

}