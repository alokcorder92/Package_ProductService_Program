package inventory;

public class ProductService{
    public static void main(String[] ar){
        Product p = new Product();
        p.productId=1;
        System.out.println("Product id:"+p.productId);

        
        p.productName="Desktop";
        System.out.println("Product Name:"+p.productName);
    }
}
