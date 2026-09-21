package org.example;

public class BruteForce {
    public static int cont = 0, precont = 0;
    public static boolean seq = false;

    public int lcs(String str1, String str2) {
        lcsrec(str1.toCharArray(), str2.toCharArray(), 0, 0);
        return cont;
    }

    private int lcsrec(char[] str1, char[] str2, int i1, int i2) {
        if(i2 >= str2.length) return cont;
        if(i1 >= str1.length) return lcsrec(str1, str2, 0, i2 + 1);
        if(!seq) precont = 0;
        if(str1[i1] == str2[i2]) {
            seq = true;
            precont = 1 + lcsrec(str1, str2, i1 + 1, i2 + 1);
            if(precont > cont) cont = precont;
            return precont;
        }
        precont = 0;
        seq = false;

        lcsrec(str1, str2, i1 + 1, i2);
        return cont;
    }
}