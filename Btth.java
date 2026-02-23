class BankAccount {
    // ===== Thuộc tính (Encapsulation) =====
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // ===== Constructor không tham số =====
    public BankAccount() {
        this.accountNumber = "UNKNOWN";
        this.accountHolder = "NO NAME";
        this.balance = 0;
    }

    // ===== Constructor có tham số (dùng this) =====
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(balance); // kiểm tra qua setter
    }

    // ===== Getter =====
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // ===== Setter (kiểm tra dữ liệu hợp lệ) =====
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("So du khong duoc am. Gan ve 0.");
            this.balance = 0;
        }
    }

    // ===== Nghiệp vụ: Nạp tiền =====
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Nap tien thanh cong: " + amount);
        } else {
            System.out.println("So tien nap phai > 0");
        }
    }

    // ===== Nghiệp vụ: Rút tiền =====
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut phai > 0");
        } else if (amount > balance) {
            System.out.println("So du khong du de rut");
        } else {
            balance -= amount;
            System.out.println("Rut tien thanh cong: " + amount);
        }
    }

    // ===== Hiển thị thông tin =====
    public void displayInfo() {
        System.out.println("So tai khoan: " + accountNumber);
        System.out.println("Chu tai khoan: " + accountHolder);
        System.out.println("So du: " + balance);
        System.out.println("---------------------------");
    }
}

public class Btth {
    public static void main(String[] args) {

        // Tạo đối tượng bằng constructor không tham số
        BankAccount acc1 = new BankAccount();

        // Tạo đối tượng bằng constructor có tham số
        BankAccount acc2 = new BankAccount("ACB001", "Ngo Quang Anh", 5000);

        // Hiển thị ban đầu
        acc1.displayInfo();
        acc2.displayInfo();

        // Thao tác với acc1
        acc1.deposit(2000);
        acc1.withdraw(500);
        acc1.displayInfo();

        // Thao tác với acc2
        acc2.deposit(3000);
        acc2.withdraw(10000); // rút quá số dư
        acc2.withdraw(2000);
        acc2.displayInfo();
    }
}
