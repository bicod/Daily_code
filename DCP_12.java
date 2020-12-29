package com.company;
import org.jetbrains.annotations.Contract;

class DCP_12 {
    static int countWays(int n)
    {
        if(n<=1)
            return n;
        return countWays(n-1)+countWays(n-2);
    }
}
public class Main{
    public static void main(String[] args) {


        // Driver method
        int s = 4;
        System.out.println("Number of ways = "
                + DCP_12.countWays(s+1));

    }
}

