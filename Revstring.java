import java.io.*;
import java.util.*;

class Revstring {

    static String returnReverse(String str) {
        if ((str == null) || (str.length() <= 1)) {
            return str;
        }
        return returnReverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String result = returnReverse("Hello");
        System.out.println(result);
    }
    // public static void main(String[] args) {
    //     StringBuffer sbf = new StringBuffer("New String");
    //     String str = "";

    //     str = sbf.reverse();

    //     System.out.println(str);
    // }
}
