package org.example;

public class Main {
    static void main() {
        String str1 = "travessao";
        String str2 = "aves";

        BruteForce objBrute = new BruteForce();
        DynamicProgramming objDinamic = new DynamicProgramming();

        System.out.println(objBrute.lcs(str1, str2));
        System.out.println(objDinamic.lcs(str1, str2));
    }
}
