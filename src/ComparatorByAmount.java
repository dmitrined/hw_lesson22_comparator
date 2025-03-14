import java.util.Comparator;

public class ComparatorByAmount implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return Integer.compare(o1.getAmount(), o2.getAmount());
    }
}
