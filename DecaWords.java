/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decawords;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.random;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class DecaWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
    File text = new File("engmix.txt");
   Scanner scnr = new Scanner(text);
   Random rand = new Random();
    int value = rand.nextInt(84090) + 1;
    String rword = "";
    for( int i=0; i<value; i++){
        rword = scnr.nextLine();
    }
    
            
        String nword = rword;
        nword = ShuffleString.shuffle(nword);
        System.out.println(nword);
      
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Arrange the word in right order:");
        String uword = keyboard.next();
       
        int points = 0;
        if(Objects.equals(rword, uword)){
            points += 10;
        } else {
            points -= 10;
        }   
        System.out.print("\n"+ rword);
        System.out.print("\n"+points);
//  int points = 0;
//        if(Objects.equals(random_word, shuffled_word)){
//            points += 10;
//        } else {
//            points -= 10;
//        }      
////   for (int j = nam.length - 1; j>=0; j--)
//       
//       System.out.print(  nam[j]);
//       
//       }
   
}}
            


