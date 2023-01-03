package hello0719;

import java.util.*;
import java.text.*;

public class Exercise10_3 {
    
    static int paycheckCount(Calendar from, Calendar to) {
        int monDiff;

        if(from.get(Calendar.YEAR) > to.get(Calendar.YEAR)){
            return 0;
        }

        // 1. from 또는 to가 null이면 0을 반환한다.
        if(from == null || to == null){
            return 0;
        }

        // 2. from과 to가 같고 날짜가 21일이면 1을 반환한다.
        if(from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21){
            return 1;
        }
     
        // 3. to와 from이 몇개월 차이인지 계산해서 변수 monDiff에 담는다.
        monDiff = to.get(Calendar.MONTH) - from.get(Calendar.MONTH);

        // 4. monDiff가 음수라면 0을 반환한다.
        if(monDiff < 0){
            return 0;
        }

        // 5. 만일 from의 일(DAY_OF_MONTH)가 21일이거나 이전이고 
        //    to의 일(DAY_OF_MONTH)이 21일 이거나 이후이면 monDiff의 값을 1 증가시킨다.
        if(from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21){
            monDiff++;
        }

        // 6. 만일 from의 일(DAY_OF_MONTH)dl 21일 이후고
        //    to의일(DAY_OF_MONTH)이 21일 이전이면 monDiff의 값을 1감소 시킨다.
        if(from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21){
            monDiff--;
        }

        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) { 
        Date fromDate   = from.getTime();
        Date toDate     = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + " : ");
        System.out.println(paycheckCount(from, to)); 
    }

    public static void main(String[] args) { 
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2020,0,1); 
        toCal.set(2020,0,1);
        printResult(fromCal, toCal);

        fromCal.set(2020,0,21); 
        toCal.set(2020,0,21); 
        printResult(fromCal, toCal);

        fromCal.set(2020,0,1); 
        toCal.set(2020,2,1); 
        printResult(fromCal, toCal);

        fromCal.set(2020,0,1); 
        toCal.set(2020,2,23); 
        printResult(fromCal, toCal);

        fromCal.set(2020,0,23); 
        toCal.set(2020,2,21); 
        printResult(fromCal, toCal);

        fromCal.set(2021,0,22); 
        toCal.set(2020,2,21); 
        printResult(fromCal, toCal);
    } 
 }

