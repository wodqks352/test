package Chap05.sec02.exam05;


public class MainStringArrayArgument {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("값의 수가 부족합니다.");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        System.out.println(strNum1 + "," + strNum2);
    }
}
