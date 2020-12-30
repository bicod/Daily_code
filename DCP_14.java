package com.company;
import org.jetbrains.annotations.Contract;
import java.util.Random;
public class Main{
    public static void main(String[] args)
    {
        double x,y,dist;
        // x^2 + y^2 = r^2
        int interval=1000;
        Random r= new Random();
        double pi=0;
        double c=0;
        double s=0;

        for(int i =0; i<interval*interval; i++)
        {
            x = r.nextDouble();
            y = r.nextDouble();

            dist = (x*x) + (y*y);

            if(dist<=1)
            {
                c++;
            }
            s++;
            System.out.println(c+" ---- "+s);
            pi=4*(c/s);
        }
        System.out.println(pi);
    }
}

