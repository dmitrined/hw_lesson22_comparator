import java.util.Comparator;

public class ComparatorByStarRating implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getStarRating(), o2.getStarRating());
    }
}
