package org.example;

public class DynamicProgramming {
    private Integer[][] memo;

    public int lcs(String str1, String str2) {
        memo = new Integer[str1.length()][str2.length()];
        return lcsRec(str1, str2, 0, 0);
    }

    private int lcsRec(String str1, String str2, int i, int j) {
        if (i == str1.length() || j == str2.length()) return 0;
        if (memo[i][j] != null) return memo[i][j];
        if (str1.charAt(i) == str2.charAt(j)) memo[i][j] = 1 + lcsRec(str1, str2, i + 1, j + 1);
        else {
            memo[i][j] = Math.max(
                lcsRec(str1, str2, i + 1, j),
                lcsRec(str1, str2, i, j + 1)
            );
        }
        return memo[i][j];
    }
}