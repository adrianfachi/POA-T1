package org.example;

public class BruteForce {
    public static int iteracoes = 0;

    public int lcs(String str1, String str2) {
        iteracoes = 0;
        int resultado = lcsRec(str1, str2, 0, 0);
        System.out.println("Número de iteracoes: " + iteracoes);
        return resultado;
    }

    private int lcsRec(String str1, String str2, int i, int j) {
        iteracoes++;
        if (i == str1.length() || j == str2.length()) return 0;
        if (str1.charAt(i) == str2.charAt(j)) return 1 + lcsRec(str1, str2, i + 1, j + 1);
        return Math.max(
            lcsRec(str1, str2, i + 1, j),
            lcsRec(str1, str2, i, j + 1)
        );
    }
}
