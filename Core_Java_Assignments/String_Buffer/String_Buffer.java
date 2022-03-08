package com.String_Buffer_String_Builder;

public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("String");
        sb.append(" is a peer class of string");
        sb.append(" that provides much of");
        sb.append(" the functionality of strings.");

        StringBuffer str = new StringBuffer("It is used to at the specified index position.");
        str.insert(14, "insert text ");

        StringBuffer str1 = new StringBuffer("This method returns the reversed object on which it was called.");
        str1.reverse();

        System.out.println(sb);
        System.out.println(str);
        System.out.println(str1);

    }
}
