package Lv1;

import java.util.Scanner;

public class Lv1 {
    public static void main(String[] args) {
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

            int result = 0;
            switch (operator) {
                case '+':
                    result = intValue + intValue2;
                    break;
                case '-':
                    result = intValue - intValue2;
                    break;
                case '*':
                    result = intValue * intValue2;
                    break;
                case '/':
                    if (intValue2 != 0) {
                        result = intValue / intValue2;
                    } else {
                        System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다");
                        boolean valid = false;
                    }
            }

            System.out.println("결과: " + result);

            scanner.nextLine();

            System.out.print("더 계산하시겠습니까? (exit: 종료)");
            String str = scanner.nextLine();
            if (str.equals("exit")){
                break; }

        }
    }
}
