package com.company;
import org.jetbrains.annotations.Contract;

class DCP_12 {
    static int countWays(int n, int m)
    {
        int res[] = new int[n];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i < n; i++) {
            res[i] = 0;
            for (int j = 1; j <= m && j <= i; j++)
                res[i] += res[i - j];
        }
        return res[n - 1];
    }
}
public class Main{
    public static void main(String[] args) {


        // Driver method
        int s = 4, m = 2;
        System.out.println("Number of ways = "
                + DCP_12.countWays(s+1, m));

    }
}

