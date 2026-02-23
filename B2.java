class Account{
    private String username;
    private String password;
    private String email;

    public Account(String username , String password , String email){
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
        System.out.println("Doi mat khau thanh cong");
    }

    public void displayInfo(){
        System.out.println("Username : "+username);
        System.out.println("Email : "+email);
        System.out.println("Password : ********");
        System.out.println("---------------");
    }
}

public class B2 {
    public static void main(String[] args){
        Account account1 = new Account("quanganh" , "190303" , "ngoquanganh2003a@gmail.com");

        account1.displayInfo();

        account1.changePassword("0386878941");

        account1.displayInfo();
    }
}
