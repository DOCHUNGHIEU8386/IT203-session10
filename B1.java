import java.time.LocalDate;

class Student{
    private String studentId;
    private String fullName;
    private LocalDate dateOfBirth;
    private double averageScore;

    public Student(String studentId , String fullName , LocalDate dateOfBirth , double averageScore){
        this.studentId = studentId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.averageScore = averageScore;
    }

    public void displayInfo(){
        System.out.println("Ma sinh vien : " +studentId);
        System.out.println("Ho ten sinh vien : "+fullName);
        System.out.println("Ngay sinh : "+dateOfBirth);
        System.out.println("Diem trung binh : "+averageScore);
        System.out.println("------------------------------");
    }
}

public class B1{
    public static void main(String[] args) {
        Student student1 = new Student("SV1" , "Ngo Quang Anh" , LocalDate.of(2003 , 3 , 19) , 8.50);
        Student student2 = new Student("SV2" , "Anh Quang" , LocalDate.of(2006 , 2 , 12) , 10);
        student1.displayInfo();
        student2.displayInfo();
    }
}
