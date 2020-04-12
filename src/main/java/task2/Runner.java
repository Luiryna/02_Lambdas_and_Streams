package task2;

import java.util.function.*;

public class Runner {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 0;
        System.out.println(predicate.test(-10));

        BinaryOperator<Integer> multiply = (x, y) -> x * y;
        System.out.println(multiply.apply(2, 3));

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(4));

        Function<Integer, String> convert = x -> x + " kittens";
        System.out.println(convert.apply(5));

        Consumer<Integer> printer = x -> System.out.printf("%d kittens \n", x);
        printer.accept(600);

        NewsInterface newsInterface = () -> System.out.println("Nu novosti i novosti, che bubnet' to");
        newsInterface.doSomeNews();

        NewsInterface newsInterface1 = new NewsInterface() {
            @Override
            public void doSomeNews() {
                System.out.println("Nu drugie novisti i drugie novosti, che bubnet' t0");
            }
        };
        newsInterface1.doSomeNews();

    }
}
