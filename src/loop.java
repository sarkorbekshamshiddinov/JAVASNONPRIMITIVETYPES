import java.util.Random;

public class loop {
    public static void main(String[] args) {
        int [] arrey = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arrey.length; i++) {
          arrey[i] = rand.nextInt(100)+1;
        }
        System.out.println("arrey :");
        for ( int num : arrey) {
            System.out.println(num + " ");
        }
        System.out.println();
        int min = arrey[0];
        int max = arrey[0];
        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] < min) {
                min = arrey[i];
            }
            if (arrey[i] > max) {
                max = arrey[i];
            }
        }
        System.out.println("Smallest : " + min);
        System.out.println("Largest : " + max);
    }
}
