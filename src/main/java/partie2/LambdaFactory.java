package partie2;
import java.util.function.Function;

public class LambdaFactory {

    public static Transformation<String> majusculeEtPrefixe() {
        return s -> ">> " + s.toUpperCase();
    }
    public static Transformation<Integer> factorielle() {
        return n -> {
            int res = 1;
            for(int i = 1; i <= n; i++) res *= i;
            return res;
        };
    }
    public static Function<Integer, Integer> fibonacci() {
        return n -> {
            if (n == 0) return 0;
            if (n == 1) return 1;
            int a = 0, b = 1, c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        };
    }
}