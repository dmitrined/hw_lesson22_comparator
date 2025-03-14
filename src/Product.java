import java.util.Comparator;

public class Product {
    private String title;
    private double price;
    private double starRating;
    private int amount;

    public Product(String title, double price, double starRating, int amount) {
        this.title = title;
        this.price = price;
        this.starRating = starRating;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getStarRating() {
        return starRating;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", starRating=" + starRating +
                ", amount=" + amount +
                '}';
    }

    public static Comparator<Product> comparatorByAmount() {
        return new ComparatorByAmount();
    }

    public static Comparator<Product> comparatorByStarRating() {
        return new ComparatorByStarRating();
    }

    public static Comparator<Product> comparatorByPrice() {
        return new ComparatorByPrice();
    }

    public static Comparator<Product> comparatorByTitle() {
        return new ComparatorByTitle();
    }


}
