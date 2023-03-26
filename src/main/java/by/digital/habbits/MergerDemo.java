package by.digital.habbits;

public class MergerDemo {
    public static void main(String[] args) {
        int sum = new Merger(5, 7)
                .merge((a, b) -> a + b);
        System.out.println(sum);
    }
}
