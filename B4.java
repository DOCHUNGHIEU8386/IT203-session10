interface RemoteControl {

    void powerOn();

    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}

public class Main {

    public static void main(String[] args) {

        // Anonymous Class
        RemoteControl smartLight = new RemoteControl() {

            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        // Gọi phương thức
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
