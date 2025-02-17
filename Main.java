import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//        1.Write a Java program to test if the first and the last element of an array of
//        integers are same. The length of the array must be greater than or equal to
//        2 Test Data:
//        array = 50, -20, 0, 30, 40, 60, 10
//        Sample Output: false




/*
        System.out.println("please enter how many numbers do want to add : " );
        int size = input.nextInt();
        int [] number  =  new int[size];
        int numb=0;
        boolean result=false;

        for (int i = 0; i < number.length; i++) {
            System.out.println("please enter the numbers : " );
            number[i]= numb=input.nextInt();
        }

        if (number[number.length - 1] == number[0]) {// if condition to test if the last number (taken from the length -1 )equal the first number (index 0)
            result =true;
        }else result=false;

        System.out.println(""+result);



*/


/// ////////////////////////////////////////////////////


//
//
//        2.Write a Java program to find the numbers greater than the average of the
//        numbers of a given array.
//                Original Array:
//               [1, 4, 17, 7, 25, 3, 100]
//        Expected Output:
//        The average of the said array is: 22.0 The numbers in the said array that are
//        greater than the average are: 25 100




        /*
        System.out.println("Please enter how many numbers you want to print their average: ");
        int size = input.nextInt();
        int numb;
        int[] Numbers = new int[size]; // array of numbers enterd from user
        int[] Larger = new int[size];// array to store the larger numbers

        int Avr = 0;// average
        int sum = 0;
        int L = 0;// a counter to increment the array of the larger numbers

        //for loop to take the numbers from the user
        for (int i = 0; i < Numbers.length; i++) {
            System.out.println("Please enter a number : ");
            Numbers[i] = numb = input.nextInt();
            sum += Numbers[i];
        }
        Avr = (sum / size);
        //for loop to put a condition and store the number larger than the average
        for (int k = 0; k < Numbers.length; k++) {
            if (Avr < Numbers[k]) {
                Larger[L] = Numbers[k];
                L++;
            }
        }
        System.out.println("The average of the said array is: " + Avr);
        System.out.println("The numbers in the said array that are greater than the average are:");
        for (int j = 0; j < L; j++) { // for loop to print the numbers in the Large array
            System.out.print("" + Larger[j]);
        }
*/
/// ////////////////////////////////////////////////////

//
//        3.Write a Java program to get the larger value between first and last
//        element of an array of integers.
//        Original Array:
//[20, 30, 40]
//        Sample Output:
//        Larger value between first and last element: 40


        /*
        System.out.println("please enter the numbers 3 numbers get the larger value between first and last element  : ");
        int [] number  =  new int[3];
        int numb=0;
       int Large= number[0];

        for (int i = 0; i < number.length; i++) {
            System.out.println("number : " + (i + 1));
            number[i] = numb = input.nextInt();

            if (Large < number[i]) {// if the largest number is smaller than the number [i] than let large = the number [i]
                Large=number[i];
            }
        }
        for (int j = 0; j < number.length; j++) {

        }
        System.out.println("Larger value between first and last element: "+Large );

        */
/// ////////////////////////////////////////////////////


//        4.Write a Java program to swap the first and last elements of an array and
//        create a new array.
//                Original Array:
//               [20, 30, 40]
//        Sample Output:
//        New array after swapping the first and last elements: [40, 30, 20]


/*
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(0,20);
        numbers.add(1,30);
        numbers.add(2,40);
        int lastindex= numbers.get(numbers.size()-1); // value to store the last index

     numbers.set(numbers.size()-1, numbers.get(0));// setting the last index to the value of index 0 (first element)
     numbers.set(0,lastindex);// setting the first index to the value of last index
        System.out.println(""+numbers);// print the array

*/

/// ////////////////////////////////////////////////////

//        5. Write a program that places the odd elements of an array before the
//        even elements.
//        Original Array:
//[2,3,40,1,5,9,4,10,7]
//        Sample Output:
//[3,1,5,9,7,2,40,4,10]

/*
        // to solve this question I created two arraylists one odd and one even and then added all the elements together in final arraylist

        ArrayList<Integer> number = new ArrayList<>();
        number.add(0,2);
        number.add(1,3);
        number.add(2,40);
        number.add(3,1);
        number.add(4,5);
        number.add(5,9);
        number.add(6,4);
        number.add(7,10);
        number.add(8,7);

        ArrayList<Integer> odd_numbers = new ArrayList<>();
        ArrayList<Integer> even_numbers = new ArrayList<>();
        ArrayList<Integer> Final = new ArrayList<>();


        for(int i = 0; i < number.size(); i++) {
            if (number.get(i) % 2 != 0) {
                odd_numbers.add(number.get(i));

            } else if (number.get(i) % 2 == 0) {
                even_numbers.add(number.get(i));
            }
        }
        Final.addAll(odd_numbers);
        Final.addAll(even_numbers) ;
        System.out.print(Final);


*/

        /// ////////////////////////////////////////////////////
//        6. Write a program that test the equality of two arrays.
//[2,3,6,6,4] [2,3,6,6,4]
//        Sample Output: true

 int [] numbers_1={2,3,6,6,4};
        int [] numbers_2={2,3,6,6,4};

        boolean result =Arrays.equals(numbers_1,numbers_2);


        System.out.printf(""+ result);

    }
}
