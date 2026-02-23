interface Payable {
    void pay(double amount);
}

abstract class PaymentMethod {

    protected String accountName;
    protected String paymentId;

    public PaymentMethod(String accountName, String paymentId) {
        this.accountName = accountName;
        this.paymentId = paymentId;
    }

    public abstract void validate();
}


class CreditCard extends PaymentMethod implements Payable {

    private String cardNumber;
    private String cvv;
    private double creditLimit;

    public CreditCard(String accountName, String paymentId,
                      String cardNumber, String cvv, double creditLimit) {
        super(accountName, paymentId);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
    }

    @Override
    public void validate() {
        if (cardNumber.length() == 16 && cardNumber.matches("\\d{16}")) {
            System.out.println("Thẻ hợp lệ.");
        } else {
            System.out.println("Thẻ không hợp lệ (phải đủ 16 chữ số).");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= creditLimit) {
            creditLimit -= amount;
            System.out.println("Thanh toán thành công bằng Credit Card: " + amount);
            System.out.println("Hạn mức còn lại: " + creditLimit);
        } else {
            System.out.println("Không đủ hạn mức tín dụng.");
        }
    }
}


class EWallet extends PaymentMethod implements Payable {

    private String phoneNumber;
    private double balance;

    public EWallet(String accountName, String paymentId,
                   String phoneNumber, double balance) {
        super(accountName, paymentId);
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    @Override
    public void validate() {
        if (phoneNumber.matches("\\d{10}")) {
            System.out.println("Ví hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }

    @Override
    public void pay(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Thanh toán thành công bằng E-Wallet: " + amount);
            System.out.println("Số dư còn lại: " + balance);
        } else {
            System.out.println("Không đủ số dư trong ví.");
        }
    }
}


public class Main {

    public static void main(String[] args) {

        Payable creditCard = new CreditCard(
                "Nguyễn Văn A",
                "CC001",
                "1234567812345678",
                "123",
                20000
        );

        Payable eWallet = new EWallet(
                "Trần Văn B",
                "EW001",
                "0987654321",
                10000
        );

        System.out.println("=== CREDIT CARD ===");
        ((PaymentMethod) creditCard).validate();
        creditCard.pay(5000);

        System.out.println("\n=== E-WALLET ===");
        ((PaymentMethod) eWallet).validate();
        eWallet.pay(3000);

        System.out.println("\n=== REWARD POINTS (Anonymous Class) ===");

        Payable rewardPoints = new Payable() {
            @Override
            public void pay(double amount) {
                int points = (int) (amount / 1000);
                System.out.println("Thanh toán bằng điểm thưởng.");
                System.out.println("Sử dụng " + points + " điểm cho số tiền " + amount);
            }
        };

        rewardPoints.pay(5000);
    }
}
