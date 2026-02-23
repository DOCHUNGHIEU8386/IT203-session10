class Product{
    private String productId;
    private String productName;
    private double price;

    public Product(String productId , String productName , double price){
        this.productId = productId;
        this.productName = productName;
        setPrice(price);
    }

    public String getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }else{
            System.out.println("Gia san pham phai > 0");
            System.out.println("---------------------");
        }
    }

    public void displayInfo(){
        System.out.println("Ma san pham :" +productId);
        System.out.println("Ten san pham :"+productName);
        System.out.println("Gia san pham :"+price);
        System.out.println("---------------------");
    }
}

public class B3 {
    public static void main(String[] args){
        Product product1 = new Product("SP01" , "Iphone 17" , 150000000);

        product1.displayInfo();

        product1.setPrice(-1500000000);

        product1.displayInfo();

        product1.setPrice(150000000);

        product1.displayInfo();
    }
}
