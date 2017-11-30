/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decawords;

/**
 *
 * @author user
 */
class ShuffleString {
    
   public static String shuffle(String text) {
    char[] word = text.toCharArray();
    for (int i = 0; i < word.length; i++) {
        int randomIndex = (int)(Math.random() * word.length);
        char temp = word[i];
        word[i] = word[randomIndex];
        word[randomIndex] = temp;
    }
    return new String(word);
}}
