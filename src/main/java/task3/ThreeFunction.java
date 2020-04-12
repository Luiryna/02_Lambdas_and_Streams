package task3;

@FunctionalInterface
public interface ThreeFunction<T, U, S, R> {
    R apply (T firstArgument, U secondArgument, S thirdArgument);
}
