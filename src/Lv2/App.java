package Lv2;

import java.util.Scanner;




public class App {



    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int intValue = scanner.nextInt();
            System.out.println("입력한 정수 = " + intValue);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int intValue2 = scanner.nextInt();
            System.out.println("입력한 정수 = " + intValue2);


            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);
            System.out.println("입력한 기호 = " + operator);

            int result12 = calculator.caculate(intValue, intValue2, operator);


            System.out.println("결과: " + result12);

            scanner.nextLine();

            System.out.print("(exit: 종료) (enter 시 재시작) 더 계산하시겠습니까?");
            String str = scanner.nextLine();
            if (str.equals("exit")){
                break; }

        }
    }



    }

