/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();
        //Cretae array for the numebrs
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            //Make random numbers from 0-101
            number[i] = (int) (Math.random() * (101 - 0) + 1);
        }
        //Create a new array to store the places
        int[] newArray = new int[101];
        //Make all the places in the new array 0
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = 0;
        }
        //BEFORE SORTING
        System.out.println("Before");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //Count sort algorithm
        test.countingSort(number);
        
        //AFTER SORTING
        System.out.println("After sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }

    /**
     *Counting Sort Algorithm
     * @param array
     */
    public void countingSort(int[] array) {
        //Create new array
        int[] newArray = new int[101];
        //Compare a position to a number 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < newArray.length; j++) {
                //Increase the number of j's that are in the array, in the newArray
                if (array[i] == j) {
                    newArray[j] = newArray[j] + 1;
                }
            }
        }
        //Go throught the original array
        for (int i = 0; i < array.length;) {
            //Go throught the new array
            for (int j = 0; j < newArray.length; j++) {
                //Check if there is any of that number
                if (newArray[j] > 0) {
                    //find out how many j's there are in the new array
                    for (int k = 0; k < newArray[j]; k++) {
                        //Make the place of i in the original array to equal j
                        array[i] = j;
                        //increase the i count
                        i++;
                    }
                }
            }
        }
    }
}
