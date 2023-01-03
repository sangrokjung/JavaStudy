package hello0725;

import java.util.*;

public class ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]); // HashSet에 objArr의 요소들을 저장.
        }

        // HashSet에 저장된 요소 출력.
        System.out.println(set);

        // HashSet에 저장된 요소들을 출력한다. (Iterator이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // [1, 1, 2, 3, 4] 1하나는 문자열 객체
    // 1
    // 1
    // 2
    // 3
    // 4
}
