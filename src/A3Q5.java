/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 test = new A3Q5();
        String[] words = {"ahat", "agd", "awe", "aqe", "aad"};
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        System.out.println("BEFORE SORT");
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }

        test.insertionAlphabet(words);

        System.out.println("AFTER SORT");
        for (int j = 0; j < words.length; j++) {
            System.out.println(words[j]);
        }

    }
/**
 * Method to alphabetize the words
 * @param words 
 */
    public void insertionAlphabet(String[] words) {
        //Go throguth the psoitions of the array except for the last place
        for (int i = 0; i < words.length - 1; i++) {
            int pos = i;
            //Check if the position is greater than o and if the first word is greater than the second
            while (pos >= 0 && words[pos].compareTo(words[pos + 1]) > 0) {
                //Swap the positions of the words constantly until its in the right position
                String temp = words[pos];
                words[pos] = words[pos + 1];
                words[pos + 1] = temp;
                pos--;
            }
        }
    }
}
