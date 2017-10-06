/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q1 test = new A3Q1();
        int[] number = new int[10];
         for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * (10 - 1) + 1);
        }

        System.out.println("Before sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        test.selectionSort(number);

        System.out.println("After sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
/**
 * Method to swap positions to make them the right order
 * @param array
 * @param p1
 * @param p2 
 */
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;


    }
/**
 * Sorting method to swap positions using the selection sort and only swap when it is the lowest number
 * @param array 
 */
    public void selectionSort(int[] array) {
        
            // Keep track of which position we are sorting
            for (int position = 0; position < array.length; position++) {
                //Go through numbers 1 to the highest number in the array
            for (int j = 1; j <= array.length + 1; j++) {
                // Go through the rest looking for a smaller number
                for (int i = 0; i < array.length; i++) {
                    //Check if there is a number smaller and if it is the smallest numebr (j)
                    if (array[i] > array[position] && array[position] == j) {
                        swap(array, i, position);
                    }
                }
            }
        }
    }
}