import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("iPhone 14", 899, 4.8, 1000));
        productList.add(new Product("MacBook Air", 1200, 4.7, 500));
        productList.add(new Product("AirPods Pro", 279, 4.6, 1500));
        productList.add(new Product("Samsung 4K TV", 699, 4.3, 300));
        productList.add(new Product("iPad Air", 599, 4.7, 800));
        productList.add(new Product("Xiaomi Mi Band 7", 50, 4.5, 2000));
        productList.add(new Product("PlayStation 5", 500, 4.9, 600));
        productList.add(new Product("Apple Watch Series 8", 450, 4.7, 1100));
        productList.add(new Product("iPhone 15", 1000, 4.8, 1050));
        productList.add(new Product("iPhone 16", 1499, 4.8, 900));

        System.out.println("---sort By title----");
        Collections.sort(productList, Product.comparatorByTitle());
        print(productList);
        System.out.println("---sort By price----");
        Collections.sort(productList, Product.comparatorByPrice());
        print(productList);
        System.out.println("---sort By star rating----");
        Collections.sort(productList, Product.comparatorByStarRating());
        print(productList);
        System.out.println("---sort By star rating reverse----");
        Collections.sort(productList, Product.comparatorByStarRating().reversed());
        print(productList);
        System.out.println("---sort By amount----");
        Collections.sort(productList, Product.comparatorByAmount());
        print(productList);
        System.out.println("---sort By star rating and price----");
        Collections.sort(productList, Product.comparatorByStarRating().thenComparing(Product.comparatorByPrice()));
        print(productList);

    }

    public static void print(List<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}