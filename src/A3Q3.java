/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laveh2107
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q2 test = new A3Q2();
        int[] number = new int[10];//
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * ((1 - 0) + 1) + 0);
        }


        System.out.println("Before sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        test.sort(number);

        System.out.println("After sorting");
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        //Check how many 1's there is 
        int one = binaryCount(number);
        System.out.println("There are " + one + " ones in the binary number");
    }

    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void sort(int[] array) {
        //Find position to comparen the other positions to
        for (int position = 0; position < array.length; position++) {
            for (int i = 0; i < array.length; i++) {
                //anything smaller 
                if (array[i] < array[position]) {
                    swap(array, i, position);
                }
            }
        }
    }

    /**
     * Method to count how many ones in a binary number recursively
     *
     * @param array
     * @return
     */
    public static int binaryCount(int[] array) {
        //Check if the array only has ones in it
        if (array[0] == 1) {
            //Retrun length of array with all ones in it
            return array.length;
        } else {
            //Create new array with a length smaller than the given array to make the array have less zeros
            int[] arrayNew = new int[array.length - 1];
            //Move the places from the first array to the new array except for the first digit
            for (int i = 0; i < array.length - 1; i++) {
                arrayNew[i] = array[i + 1];
            }
            //Return the new array, whcih is smaller and less zeros
            return binaryCount(arrayNew);
        }
    }
}
