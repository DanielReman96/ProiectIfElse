import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {



//    public float returnFloatValue(){
//
//        Scanner scanner = new Scanner(System.in);
//        float number = 0;
//        boolean repeat = true;
//
//        while (repeat){
//        try {
//            System.out.println(" Please enter a number from keyboard:  ");
//            scanner.nextFloat();
//            repeat = false;
//
//        }   catch (InputMismatchException e){
//            System.out.println(" The valuea  [" + );
//
//
//        }
//
//        }
//        return number;
//    }



    public int returnNumberFromKeyboard(){

        Scanner scanner = new Scanner(System.in);


        System.out.println(" Please enter a number from keyboard:  ");
        int number = scanner.nextInt();

        System.out.println(" My number from keyboard is: " + number);

        return number;

    }

    public int returnIntNumberFromKeyboard(){

        Scanner scanner = new Scanner(System.in);


        System.out.println(" Please enter a number from keyboard:  ");
        int number = scanner.nextInt();

        System.out.println(" My number from keyboard is: " + number);

        return number;

    }


    public float returnFloatNumberFromKeyboard(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter a float number from keyboard: ");
        float number = scanner.nextFloat();

        System.out.println(" My float number from keyboard is: " + number);

        return number;

    }

    public double returnDoubleNumberFromKeyboard(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter double number from keyboard: ");
        double number = scanner.nextDouble();

        System.out.println(" My double number from keyboard is: " + number);

        return number;
    }

    public long returnLongNumberFromKeyboard(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please enter long number from keyboard: " );

        long number = scanner.nextLong();

        System.out.println(" My long number from keyboard is: " + number);

        return number;
    }

    public void myMenu() {

        System.out.println(" Select option please: " );
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();



        switch (option) {


            case 1:
                System.out.println(" You chose to print an int ");

                returnIntNumberFromKeyboard();

                break;
            case 2:
                System.out.println(" You chose to print an  float ");

                returnFloatNumberFromKeyboard();

                break;

            case 3:
                System.out.println(" You chose to print an  double ");

                returnDoubleNumberFromKeyboard();


                break;
            case 4:
                System.out.println(" You chose to print an  long ");

                returnLongNumberFromKeyboard();

                break;

            default:
                break;



        }

    }


    public int[] returnFullArray(int index){

        Scanner scanner = new Scanner(System.in);

        int[] myArray = new int[index];

        System.out.println(" Please enter a number for array: ");

        for (int i = 0; i < index; i++) {
            myArray[i] = scanner.nextInt();
        }

        return myArray;
    }



    public void printFullArray(int[] myArray){

        System.out.println(" The array is: ");

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
            System.out.print(myArray[i] + " ");
        }

    }


    public List<Integer> printOfListIntegerFromKeyboard(){

        List<Integer> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean repeat = true;
        int number;

            while (repeat) {

                try {
                    System.out.println(" Please enter a number from keyboard: ");
                    number = scanner.nextInt();
                    myList.add(number);
                    System.out.println("My list is: " + myList);


                } catch (InputMismatchException e) {

                    System.out.println(" The value: " + scanner.nextLine() + " is not a numeric value");

                }
            }
        return myList;

    }

















}
