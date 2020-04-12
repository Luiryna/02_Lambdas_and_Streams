package task2;

@FunctionalInterface
public interface NewsInterface {
    void doSomeNews();

    static String doStaticNews(String string){
        return "Nu "+ string + " novosti i novosti, che bubnet' to";
    }

    default String doDefaultNews(String string) {
        return "Nu "+ string + " novosti i novosti, che bubnet' to";
    }
}
