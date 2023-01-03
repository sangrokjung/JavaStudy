package hello0726;

import java.util.*;

public class ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");    //값이 다른경우 마지막 값으로 저장된다.

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.println("id와 psw를 입력하세요.");
            System.out.print("id : ");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력하세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)){
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
            }
            else{
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }
    }
}
