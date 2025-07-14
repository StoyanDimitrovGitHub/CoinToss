import java.util.Random;

public class coinToss {
    public static void main(String[] args) {
        Random random = new Random();
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1; i++) {
            boolean isHead = random.nextBoolean();
            if (isHead) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
