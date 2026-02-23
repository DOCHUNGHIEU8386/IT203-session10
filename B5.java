abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    // Phương thức trừu tượng
    public abstract double calculateSalary();
}

interface BonusCalculator {
    double getBonus();
}

class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Không có thưởng
    }
}

class Manager extends Employee implements BonusCalculator {

    private double kpiBonus;

    public Manager(String name, double baseSalary, double kpiBonus) {
        super(name, baseSalary);
        this.kpiBonus = kpiBonus;
    }

    @Override
    public double getBonus() {
        return kpiBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}

public class Main {

    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyễn Văn A", 8000);
        Employee manager = new Manager("Trần Văn B", 15000, 5000);

        Employee[] employees = { staff, manager };

        System.out.println("=== BẢNG LƯƠNG NHÂN VIÊN ===");

        for (Employee e : employees) {

            System.out.println("Tên: " + e.getName());
            System.out.println("Lương cơ bản: " + e.baseSalary);

            if (e instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) e;
                System.out.println("Thưởng KPI: " + b.getBonus());
            } else {
                System.out.println("Thưởng KPI: Không có");
            }

            System.out.println("Tổng lương: " + e.calculateSalary());
            System.out.println("---------------------------");
        }
    }
}
