package com.company;
import org.jetbrains.annotations.Contract;
class DCP_7
{
    static int countDecodingDP(char digits[], int n)
    {
        int count[] = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        if (digits[0] == '0') 
        {
            return 0;
        }
        for (int i = 2; i <= n; i++) 
        {
            count[i] = 0;
            if (digits[i - 1] > '0') 
            {
                count[i] = count[i - 1];
            }

            if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7')) 
            {
                count[i] += count[i - 2];
            }
        }
        return count[n];
    }
}

public class Main {


        // Driver Code
        public static void main (String[] args)
        {
            char digits[] = {'1','1','1'};
            int n = digits.length;
            System.out.println(DCP_7.countDecodingDP(digits, n));
        }


}
