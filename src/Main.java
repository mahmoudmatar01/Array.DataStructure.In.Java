import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Array:- is the packet that holds many variable with same data type
        // Array --> Fixed size
        // Array --> Deletion is hard

        // declaring an array
        String[]colors=new String[5];  // arraySize = 5    array element data type => String

        // print all element in array
        System.out.println(Arrays.toString(colors));  // => [ null, null, null, null, null ]

        // array element =>  null, null, null, null, null
        // array element indexes =>  0, 1, 2, 3, 4,

        // set element in array in specific index
        colors[0]="Green";
        System.out.println(colors[0]); // Green
        colors[1]="Blue";
        System.out.println(Arrays.toString(colors)); // [ Green, Blue, null, null, null ]

        // trying to print element in index doesn't exist
        // ** System.out.println(colors[6]);  // will throw ArrayIndexOutOfBoundsException : Index 6 out of bounds for length 5

        // update element value in array
        colors[1]="Yellow";
        System.out.println(Arrays.toString(colors)); // [ Green, Yellow, null, null, null ]


        //------------------------- another way to declare arrays ----------------------------------
        // Integer numbers array
        int []numbers={12,34,5};

        // another ways to print array elements
        for(int number:numbers){
            System.out.println(number);
        }
        // or  ----------------
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // or  ----------------
        Arrays.stream(numbers).forEach(System.out::println);

        // -------------------------------------------------------------------------

        // Array with data type char
        char[]chars=new char[4];
        Scanner input=new Scanner(System.in);

        // get data from the user
        for (int i = 0; i < chars.length; i++) {
            System.out.println("Enter element "+(i+1));
            chars[i]=input.next().charAt(0);
        }
        System.out.println(Arrays.toString(chars));

        // ---------------------------- Working with 2D Array ----------------------

        // declaration 2d array with 3 columns and 3 rows
        char[][]board=new char[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                // get data from the user
                board[i][j]=input.next().charAt(0);
            }
        }
        //print 2d array element
        System.out.println(Arrays.deepToString(board));






    }
}