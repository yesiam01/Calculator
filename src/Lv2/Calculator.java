package Lv2;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    public List<String> cal;

    public Calculator() {
        cal = new ArrayList<>();
    }
//  타입의 값, 기능의 이름=메서드 (매계 변수)
    public int caculate(int intValue, int intValue2, char operator) {
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
                }
        }
        String record = intValue + " " + operator + " " + intValue2 + " = " + result;
        cal.add(record);


        return result;
    }
}


