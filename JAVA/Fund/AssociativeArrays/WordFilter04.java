package AssociativeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        Arrays.stream(words).filter(word->word.length()%2==0)
                .forEach(e->System.out.println(e));
    }
}
