public class Main {
    public static void main(String[] args) {
//        int n=120;
//        if (n>25 & n<100){
//            System.out.println("Число" + n +" лежить в проміжку (25:100)");
//        }else{
//            System.out.println("Число "+ n +" не лежить в проміжку (25:100)");
//        }
//        Завдання 2

//        int n=478;
//        if (n>99 & n<1000){
//            int a=n/100;
//            int b=(n/100)%10;
//            int c=n%10;
//            if (a>=b & a>=c){
//                System.out.println("Найбільша цифра"+a);
//            } else if (b>=a & b>=c){
//                System.out.println("Найбільша цифра"+b);
//            } else if (c>=a & c>=b) {
//                System.out.println("Найбільша цифра " +c);
//            }
//        }else{System.out.println("Число не трьохзначне");}

//        Завдання 3

        int start = 1;
        int n = 8;
        if (n > 0 & n <= 9) {
            if (n == start) {
                System.out.println("Ви на першому поверсі");
            }
            if (n > start) {
                if (n == 2) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 3) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви піднялись на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви піднялись на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви піднялись на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви піднялись на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви піднялись на 8 поверх");
                } else if (n == 9) {
                    System.out.println("Ви піднялись на 9 поверх");
                }
            }
            if (n < start) {
                if (n == 1) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 2) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 3) {
                    System.out.println("Ви спустились на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви спустились на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви спустились на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви спустились на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви спустились на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви спустились на 8 поверх");
                }
            }
        } else{
            System.out.println("Ви ввели неіснуючий поверх");
        }
    }
}