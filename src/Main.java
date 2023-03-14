import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        int minVal = 0;
        int maxVal = 200;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            int randInt = ThreadLocalRandom.current().nextInt(minVal, maxVal);
            list.add(randInt);
        }


        System.out.println(list);
    }
}