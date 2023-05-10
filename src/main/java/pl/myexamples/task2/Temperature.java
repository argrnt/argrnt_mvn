package pl.myexamples.task2;

import java.util.Random;

public class Temperature {

    public static void main(String[] args) {

            howManyMeasurement(20);

    }


    private static void howManyMeasurement(int howMany){
        for (int i = 1; i <= howMany; i++) {
            double generator=generator();
            System.out.printf("%s . %.1f :",i,generator);
            measurement(generator);
        }
    }

    private static void measurement(double temp){
        if(temp>35 && temp<=37){
            System.out.println("temperature normal");
        }
        if(temp>37 && temp<38.5){
            System.out.println("low-grade fever");
        }
        if(temp>=38.5 && temp<=40){
            System.out.println("fever");
        }
        if(temp>40 && temp<41){
            System.out.println("call an ambulans");
        }
        if(temp<=35 || temp >=41){
            System.out.println("measurement error");
        }
    }

    private static double generator(){
        Random random = new Random();
        return random.nextDouble(33, 42);
    }




}
