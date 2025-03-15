import java.util.ArrayList;
import java.util.Arrays;
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

        FromUserListSort sorter = new FromUserListSort(productList);
        sorter.sortAndPrint();

    }

}