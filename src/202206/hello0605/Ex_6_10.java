package hello0605;

public class Ex_6_10 {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();

        System.out.println("mm.add(3,3) 결과 :" + mm.add(3,3));
        System.out.println("mm.add(3L, 3) 결과 :" + mm.add(3L, 3));
        System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3,3L));
        System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3,3L));
    }
}
