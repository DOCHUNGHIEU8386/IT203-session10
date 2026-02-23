class Book{
    // Biến instance (thuộc tính của đối tượng)
    private String bookId;
    private String title;
    private double price;

    // Constructor (tham số trùng tên thuộc tính)
    public Book(String bookId , String title , double price){
        this.bookId = bookId; // biến instance
        this.title = title;
        this.price = price;
    }

    public void displayInfo(){
        System.out.println("Ma sach :"+bookId);
        System.out.println("Ten sach :"+title);
        System.out.println("Gia sach :"+price);
        System.out.println("--------------------");
    }
}

public class B5 {
    public static void main(String[] args){
        Book book1 = new Book("B01" , "Java Fundermental" , 1200000);

        book1.displayInfo();
    }
}
