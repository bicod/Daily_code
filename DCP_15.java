package com.company;

import java.util.Random;

class DCP_15 {
    static int res = 0;
    static int count = 0;

    static int selectRandom(int x) {
        count++;
        if (count == 1)
            res = x;
        else {
            Random r = new Random();
            int i = r.nextInt(count);

            if (i == count - 1)
                res = x;
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] stream = {1, 2, 3, 4};
        int n = stream.length;
        DCP_15 d= new DCP_15();
        for (int i = 0; i < n; i++)
            System.out.println("Random number from first " + (i + 1) +
                    " numbers is " + d.selectRandom(stream[i]));

    }
}

