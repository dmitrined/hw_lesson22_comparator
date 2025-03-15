import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FromUserListSort implements ListSort {
    private List<Product> productList;

    public FromUserListSort(List<Product> productList) {
        this.productList = productList;
    }


    public void sortAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ сортировки:");
        String[] userOutput = {
                "По цене (возрастание)",
                "По цене (убывание)",
                "По рейтингу (возрастание)",
                "По рейтингу (убывание)",
                "По количеству (возрастание)",
                "По количеству (убывание)",
                "По названию (по алфавиту)",
                "По названию (в обратном алфавитном порядке)"
        };
        for (int i = 0; i < userOutput.length; i++) {
            System.out.println(i + 1 + ". " + userOutput[i]);
        }
        int selectNumber = scanner.nextInt();
        Comparator<Product> comparator = null;
        if (selectNumber == 1) {
            comparator = Product.comparatorByPrice();
        } else if (selectNumber == 2) {
            comparator = Product.comparatorByPrice().reversed();
        } else if (selectNumber == 3) {
            comparator = Product.comparatorByStarRating();
        } else if (selectNumber == 4) {
            comparator = Product.comparatorByStarRating().reversed();
        } else if (selectNumber == 5) {
            comparator = Product.comparatorByAmount();
        } else if (selectNumber == 6) {
            comparator = Product.comparatorByAmount().reversed();
        } else if (selectNumber == 7) {
            comparator = Product.comparatorByTitle();
        } else if (selectNumber == 8) {
            comparator = Product.comparatorByTitle().reversed();
        } else {
            System.out.println("Некорректно введено");
            return;
        }
        if (comparator != null) {
            Collections.sort(productList, comparator);
            System.out.println("Вы выбрали способ сортировки: " + userOutput[selectNumber - 1]);
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }
}