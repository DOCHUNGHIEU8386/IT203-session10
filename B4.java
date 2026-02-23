class Employee {
    private String employeeId;
    private String employeeName;
    private double salary;

    // constructor khong tham so
    public Employee(){
        this.employeeId = "";
        this.employeeName = "";
        this.salary = 0;
    }

    // constructor co ma va ten
    public Employee(String employeeId , String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = 0;
    }

    //constructor co day du
    public Employee(String employeeId , String employeeName , double salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Ma nhan vien :"+employeeId);
        System.out.println("Ten nhan vien :"+employeeId);
        System.out.println("Luong :"+salary);
        System.out.println("--------------------");
    }
}

public class B4 {
    public static void main(String[] args){
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("NV1" , "Ngo quang anh");
        Employee employee3 = new Employee("NV2" , "Anh Quang" , 50000000);

        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
