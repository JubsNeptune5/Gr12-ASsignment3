/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q2 test = new A3Q2();
        int[] number = {0,1,2,3,7,8,9,12};
        
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        //Check what is the lowest number missing 
        int missing = smallestMissingNumber(number);

        //Say all the numbers are there when the method returns a zero
        if (missing == 0) {
            System.out.println("There isnt a number missing");
        } else {
            System.out.println("The smallest missing number is: " + missing);
        }
    
    }
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void sort(int[] array) {
        //Start with one position
        for (int i = 0; i < array.length; i++) {
            //Go throught all the positions to compare
            for (int position = 0; position < array.length; position++) {
                //Check if the postion is smaller
                if (array[i] < array[position]) {
                    swap(array, i, position);
                }
            }
        }
    }
/**
 * Method to find the lowest missing number in an 
 * @param array
 * @return 
 */
    public static int smallestMissingNumber(int[] array) {
            //Go thorught each position in the array
            for (int i = 0; i < array.length;) {
                //Check if the first number is smaller than the second and if the are consectutive
                if (array[i]+1 == array[i+1]) {
                    i++;
                    //Return the value afer the frist numebr that is missing
                } else {
                    return array[i] + 1;
                }
            }
        //Return zero if all the numebrs are present
        return 0;
    }
}
