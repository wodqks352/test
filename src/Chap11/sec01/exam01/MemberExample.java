package Chap11.sec01.exam01;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if (obj1.equals(obj2)) {
            System.out.println("동일");
        } else {
            System.out.println("동일하지 않습니다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("동일");
        } else {
            System.out.println("동일하지 않습니다.");
        }
    }
}