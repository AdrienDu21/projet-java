package partie2;
import java.util.List;
import java.util.NoSuchElementException;

public class OutilsGeneriques {

    public static <T extends Comparable<T>> T max(List<T> liste) {
        if (liste == null || liste.isEmpty()) throw new NoSuchElementException();
        T maximum = liste.get(0);
        for (T element : liste) {
            if (element.compareTo(maximum) > 0) {
                maximum = element;
            }
        }
        return maximum;
    }
    public static <T> String concat(List<T> liste, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < liste.size(); i++) {
            sb.append(liste.get(i));
            if (i < liste.size() - 1) sb.append(sep);
        }
        return sb.toString();
    }
}