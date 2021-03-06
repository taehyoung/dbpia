package koreatech.cse.controller;

import java.io.PrintStream;

public class StringSimilarity {
    public static double similarity(String s1, String s2) {
        int longerLength;
        String longer = s1;
        String shorter = s2;
        if (s1.length() < s2.length()) {
            longer = s2;
            shorter = s1;
        }
        if ((longerLength = longer.length()) == 0) {
            return 1.0;
        }
        return (double)(longerLength - StringSimilarity.editDistance(longer, shorter)) / (double)longerLength;
    }

    public static int editDistance(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int[] costs = new int[s2.length() + 1];
        for (int i = 0; i <= s1.length(); ++i) {
            int lastValue = i;
            for (int j = 0; j <= s2.length(); ++j) {
                if (i == 0) {
                    costs[j] = j;
                    continue;
                }
                if (j <= 0) continue;
                int newValue = costs[j - 1];
                if (s1.charAt(i - 1) != s2.charAt(j - 1)) {
                    newValue = Math.min(Math.min(newValue, lastValue), costs[j]) + 1;
                }
                costs[j - 1] = lastValue;
                lastValue = newValue;
            }
            if (i <= 0) continue;
            costs[s2.length()] = lastValue;
        }
        return costs[s2.length()];
    }

    public static void printSimilarity(String s, String t) {
        System.out.println(String.format("%.3f is the similarity between \"%s\" and \"%s\"", StringSimilarity.similarity(s, t), s, t));
    }
}