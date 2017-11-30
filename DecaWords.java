<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class DecaWords {

    public static void main(String[] args) throws IOException {
        //System.out.print(new File(".").getAbsoluteFile());

        // get the file.
        File my_file = new File("./src/engmix.txt");
        Scanner scn = new Scanner(my_file);

        runner(scn);

        }

    private static void runner(Scanner scn) {
        String random_word = get_random_word(scn); // get random word.

        String shuffled_word = get_shuffled_word(random_word); // shuffle the letters of the word.

        int points = 0;
        if(Objects.equals(random_word, shuffled_word)){
            points += 10;
        } else {
            points -= 10;
        }

        System.out.println(points);
    }

// MADHU WORK ON THIS SPECIFIC FUNCTION.
    private static String get_shuffled_word(String word) {

        // splitting the word into letters and appending to array.
        Random rand = new Random();
        char[] arr1 = new char[word.length()];
        for (int j = 0; j < word.length(); j++) {
            arr1[j] = word.charAt(j);
        }

        // shuffle the letter in random order.
        char[] shuffled_arr = new char[arr1.length]; // keep the shuffled letter
        int[] random_num_arr = new int[arr1.length]; // track the random numbers, if same repeat the process of adding random letter in array.
        int shuffle_rand_num;

        for (int i = 0; i < arr1.length; i++) {
            shuffle_rand_num = rand.nextInt(arr1.length) + 1;
            random_num_arr[i] = shuffle_rand_num;
            shuffled_arr[i] = arr1[shuffle_rand_num];
        }
    }


    private static String get_random_word(Scanner scn) {
        Random rand = new Random();
        int num = rand.nextInt(84090) + 1;

        String word ="";
        for (int i = 0; i < num; i++){
            word = scn.nextLine();
        }
        System.out.println(word);
        return word;
    }
=======
public class DecaWords {

    
>>>>>>> 91afd9e223b5a83badde5248854caba2a63f6547
}
