package Chap06.sec06.exam06;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);

        System.out.println("속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println(myCar.getSpeed());
    }
}
