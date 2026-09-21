package org.example;

public class Main {
    static void main() {
        String str1 = "travessao";
        String str2 = "aves";

        BruteForce obj = new BruteForce();

        System.out.println(obj.lcs(str1, str2));
    }
}
