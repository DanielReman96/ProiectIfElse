import java.util.ArrayList;
import java.util.List;

//
public class LogicalOp {
//
//
//    public int checkBiggerNumber(int firstNumber, int secondNumber){
//
//        if(firstNumber > secondNumber){
//
//            return firstNumber;
//        }
//        else {
//            return secondNumber;
//        }
//
//
//    }
//
//
//    public String compareText(String text){
//
//        if(text.equals("FastTrack")){
//            return "Learning text comparison";
//
//        }
//
//        else {
//            return "Go to try some more";
//
//        }
//
//    }
//
//
//    public String compareTextNumber (String text, int number){
//
//        if(text.equals("FastTrackIT")  && number <= 3){
//
//            return text + number;
//
//        }
//
//        else if(!text.equals("FastTrackIT") && number >= 4){
//
//
//            return number + text;
//        }
//
//
//        return text;
//    }
//
//
//
//    public String compareNumber(int number){
//        if((number > 8  || number == 6 )){
//
//         return "The amount of snow this winter was(cm): " + number;
//
//        }
//        else{
//            return "The forecast snow is(cm) " + number;
//        }
//
//    }
//
//
//    public String compareNumberTwo(int number){
//        if(number > 3 && number != 4) {
//            return "The number is greater than 3 and not equal to 4";
//
//        }
//        else if (number == 4){
//            return "The number is equal to 4";
//
//        }
//
//        else if(number < 3) {
//            return "The number is lower than 3";
//        }
//
//        return "number";
//
//    }

//    public void   switchCase(int number) {
//
//        switch (number) {
//            case 1:
//                System.out.println("The number is 1");
//                break;
//            case 2:
//                System.out.println("The number is 2");
//                break;
//            case 3:
//                System.out.println("The number is 3");
//                break;
//            case 4:
//                System.out.println("The number is 4");
//                break;
//            default:
//                System.out.println("The number is higher");

//        }
//
//
//    }
//
//
//    public boolean isNumberEven(int number){
//        if(number % 2 == 0) {
//            return true;
//        }
//
//        return false;
//
//    }
//
//    public boolean isEligibleToVote(int age){
//
//        if (age >= 18){
//            return true;
//        }
//        return false;
//
//    }
//
//
//    public int biggestNumber(int firstNumber, int secondNumber, int thirdNumber){
//
//        if(firstNumber > secondNumber){
//            return firstNumber;
//        }
//        else if (firstNumber > thirdNumber){
//            return firstNumber;
//        }
//        else if (secondNumber > thirdNumber){
//            return secondNumber;
//        }
//        return thirdNumber;
//
//    }
//
//
//
//    public void numberToHundred (int number){
//
//        for (int i = number; number <= 100; number++){
//            System.out.println(number);
//
//        }
//
//    }
//
//    public void numberToNegativeHundred (int number ){
//
//        for (int i = number; number >= -100; number--){
//            System.out.println(number);
//
//        }
//
//    }
//
//    public void numberToNumber(int firstNumber, int secondNumber){
//
//        for(int i = firstNumber; firstNumber <= secondNumber; firstNumber++){
//            System.out.println(firstNumber);
//
//        }
//
//
//    }
//
//
//    public void numberToBiggestNumber(int firstNumber, int secondNumber){
//
//        if (firstNumber > secondNumber){
//
//            for (int i = secondNumber; secondNumber <= firstNumber; secondNumber++ ){
//                System.out.println(secondNumber);
//            }
//
//        }
//        else
//            for (int i = firstNumber; i <= secondNumber; i++){
//                System.out.println(i);
//
//            }
//
//
//    }
//
//    public void evenNumberToHundred(){
//
//        for (int i = 1; i <= 100; i++){
//
//            if (i%2 == 0){
//                System.out.println(i);
//            }
//        }
//    }
//
//    public void oddNumberToHundred(){
//
//        for (int i = 1; i <= 100; i++){
//
//            if (i % 2 == 1){
//                System.out.println(i);
//
//            }
//
//        }
//
//    }
//
//
//    public int sumOfNumber (int number){
//        int sum = 0;
//        for (int i = number; number <= 100; number++){
//
//            sum = sum + number;
//
//        }
//
//        return sum;
//    }
//
//
//    public float sumAndAverage (int number){
//        float sum = 0;
//        float average = 0;
//        int count = 0;
//        for (int i = number; i <= 100; i++){
//            sum = sum + i;
//            count++;
//
//        }
////        System.out.println(sum);
////        System.out.println(count);
//
//        average = sum / count;
//
//        return  average;
//    }
//
//
//    public void pyramid(int number){
//
//        for (int i = 0; i <= number; i++){
//            for (int j = 0; j <= i; j++){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//
//    }
//
//
//    public void inversePyramid(int number){
//        for (int i = 1; i <= number; i++){
//            for (int j = number; j >= i; j--){
//
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//

//    public void whileNumberToHundred(int number) {
//        while (number <= 100) {
//
//
//            System.out.println(number);
//            number++;
//
//        }
//
//
//    }
//
//    public void whileNumberNegativeHundred(int number) {
//        while (number >= -100) {
//
//            System.out.println(number);
//            number--;
//
//        }
//
//
//    }
//
//
//    public void whileNumberToNumber(int firstNumber, int secondNumber) {
//        while (firstNumber < secondNumber) {
//
//            System.out.println(firstNumber);
//            firstNumber++;
//
//        }
//        while (firstNumber >= secondNumber) {
//
//            System.out.println(secondNumber);
//            secondNumber++;
//        }
//
//    }
//
//    public void whileNumberToBiggestNumber(int firstNumber, int secondNumber) {
//
//        while (firstNumber > secondNumber) {
//            System.out.println(secondNumber);
//            secondNumber++;
//
//        }
//
//        while (firstNumber <= secondNumber) {
//            System.out.println(firstNumber);
//            firstNumber++;
//        }
//
//    }
//
//    public void whileEvenNumber() {
//        int number = 1;
//        while (number <= 100) {
//            if (number % 2 == 0) {
//                System.out.println(number);
//            }
//            number++;
//
//        }
//    }
//
//    public void whileOddNumber() {
//        int number = 0;
//        while (number <= 100) {
//            if (number % 2 == 1) {
//                System.out.println(number);
//            }
//            number++;
//
//        }
//
//    }
//
//    public void numberToNumberSumAndAverage() {
//        int firstNumber = 111;
//        int secondNumber = 8899;
//        float sum = 0;
//        int count = 0;
//        while (firstNumber <= secondNumber) {
//            sum = sum + firstNumber;
//            count++;
//            firstNumber++;
//
//        }
//        System.out.println(sum);
//        System.out.println(count);
//        float average = sum / count;
//        System.out.println(average);
//
//    }
//
//
//    public float divisibleSeven(int firstNumber, int secondNumber) {
//        int count = 0;
//        float sum = 0;
//        while (firstNumber <= secondNumber) {
//
//            if (firstNumber % 7 == 0) {
//
//                sum = sum + firstNumber;
//                System.out.println(firstNumber);
//                count++;
//            }
//
//            firstNumber++;
//
//        }
//        float average = sum / count;
//        System.out.println(count);
//        System.out.println(sum);
//        System.out.println(average);
//
//        return average;
//    }
//
//
//    public void numberFibonacci() {
//        int firstNumber = 0;
//        int secondNumber = 1;
//        int count = 0;
//        System.out.print(firstNumber + " " + secondNumber);
//
//        while (count < 10) {
//
//            int thirdNumber = firstNumber + secondNumber;
//            System.out.print(" " + thirdNumber);
//            firstNumber = secondNumber;
//            secondNumber = thirdNumber;
//            count++;
//
//        }
//
//
//    }
//
//
//    public void cozaLozaWoza() {
//       int i = 1;
//
//            while (i <= 110) {
//
//                if(i % 11 == 0){
//
//                    System.out.println(i + " ");
//                    i++;
//                }
//
//                System.out.print(i + " ");
//                i++;
//            }
//
//    }
//
//
//
//    public boolean verifyIsInArray(int[] myArray, int value){
//
//        for (int i = 0; i < myArray.length; i++){
//
//            if (myArray[i] == value){
//                return true;
//            }
//
//
//        }
//
//
//
//        return false;
//    }



    public int[] getOneToHundredArray (){

        int[] myArray = new int[100];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;

        }

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");


        }


        return myArray;
    }


    public int[] setEvenNumberArray(int positions){

        int[] myArray = new int[positions];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }

        return myArray;
    }

    public void printEvenNumberArray(int[] myArray){

        for (int i = 0; i < 100; i++){
            if (myArray[i] % 2 == 0){
                System.out.print(myArray[i] + " ");
            }

        }

    }

    public int[] numberForAverageArray(int positions){

        int[] myArray = new int[positions];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }

        return myArray;
    }

    public void getAverageArrayNumber(int[] myArray){
        int count = 0;
        float sum = 0;
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
            count++;
            sum = sum + myArray[i];

        }

        float average = sum / count;
        System.out.println("Sum is " + sum + " and count is " + count + " and average is " + average  );
    }



    public float averageNumberArray(int[] myArray){

        float sum = 0;

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
            sum = sum + myArray[i];
        }

        float average = sum / myArray.length;
        return average;
    }


   public boolean checkStringArray(String[] array, String arrayValue){

        for (int i = 0; i < array.length; i++){
            if (array[i] == arrayValue){
                return true;
            }
        }
        return false;
   }



   public int[] numberArray(int position) {

        int[] array = new int[position];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;

        }

        return array;
   }


    public int checkNumberReturnPosition(int[] myArray, int value){

        for (int i = 0; i < myArray.length; i++){
            if (myArray[i] == value){
                return i;
            }
        }


        return -1;
    }

    public void myGridLine(){

        char[] line = {'-','-','-','-','-','-','-','-','-','-',};

        for (int i = 0; i <= 10; i++){
            System.out.println(line);
        }



    }








    public int[] myArrayExEight(int position){

        int[] myArray = new int[position];
        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;
        }


        return myArray;
    }


    public int[] checkMyArrayAndReturnWithoutNumber(int[] myArray, int number){


        for (int i = 0; i < myArray.length; i++){

            if (myArray[i] == number){

                i = i + 1;
            }
            System.out.println(myArray[i]);

        }

        return myArray;
    }






   int[] myArraySecondLowest = {8,5,1,3,5,6,58,9};

    public int getSecondLowestNumber(int[] myArray){

        int secondLowestNumber = 0;

        for (int i = 0; i < myArray.length; i++){
            for (int j = i + 1; j < myArray.length; j++){

                if (myArray[i] < myArray[j]){
                    secondLowestNumber = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = secondLowestNumber;

                }
            }

        }
        System.out.println(secondLowestNumber);


        return myArray[1];

    }



        public int[] myCopyArray (int[] fullArray, int[] emptyArray){


       for (int i = 0, j = 0; i < fullArray.length; i++){

           emptyArray[j] = fullArray[i];
           j++;
       }

       return emptyArray;

    }

    public void myEmptyArray(int[] myArray){

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i] + " ");

        }


    }

// Tema optionala

    public int[] elementInPosition(int index, int value){
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i + 1;

            if(index == i){
                myArray[i] = value;
            }

            System.out.println(myArray[i]);

        }

        return myArray;

    }

    int[] myMinMaxArray = {99,15,78,61,50,45,99,22,15,10};
    public int maxAndMinArray(int[] myArray){

        int min = myMinMaxArray[0];
        int max = myMinMaxArray[0];
        for (int i = 0; i < myMinMaxArray.length; i++){

            System.out.println(myMinMaxArray[i]);

            if (myMinMaxArray[i] < min){
                min = myMinMaxArray[i];
            }

            if (myMinMaxArray[i] > max){
                max = myMinMaxArray[i];
            }

        }

        System.out.println( " The min is " + min + " and the max is  " + max);


        return max;
    }



    public int[] myInversionArray(int[] myArray){

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        for (int i = myArray.length - 1; i >= 0; i--){
            System.out.print(myArray[i] + " ");
        }

        return myArray;
    }


    public int myDuplicateValueOfArray(int[] myArray){


       for (int i = 0; i < myArray.length; i++){
           for (int j = i + 1; j < myArray.length; j++){

               if (myArray[i] == myArray[j]){
                   System.out.println(myArray[j]);
               }
           }
       }

        return 0;
    }


    String[] myFirstStringArray = {" Dani ", " Markus ", " Vlad ", " John ", " Martin ", " Kevin ", " Emi "};
    String[] mySecondStringArray = {" David ", " Markus ", " Gabi ", " John ", " Martin ", " Hartmann ", " Emi "};

    public String returnCommonString(String[] myArray, String[] mySecondArray){

        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < mySecondArray.length; j++){

                if (myArray[i] == mySecondArray[j]){
                    System.out.println(mySecondArray[j]);
                }
            }
        }



        return null;
    }


    int[] unorderedNumbers = {9, 19, 4, 3 , 5, 1, 7, 10, 20};
    public int returnOrderedNumbers(int[] myArray){

        for (int i = 0; i < myArray.length; i++){
            for (int j = i + 1; j < myArray.length; j++){

                int temporary = 0;

                if (myArray[i] > myArray[j]){
                    temporary = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temporary;

                }


            }
            System.out.println(myArray[i]);
        }

        return 0;
    }






    public void printListElement(List<String> myList){

        for (String name:myList)
        System.out.println(name);

    }


    public void numberTheEndOfTheList(List<Integer> myList, int number){

        myList.add(myList.size(),number);
    }

    public void printElementFromNumber(List<Integer> myList, int position){

        for (int i = position; i < myList.size(); i++){

            System.out.println(myList.get(i));
        }

    }

    public void printReversDisplayElement(List<Integer> myList){

            for (int i = myList.size() - 1; i >= 0; i--){

                System.out.print(myList.get(i) + " ");
            }

    }


    public void addToStringToPosition(List<String> myList, int index, String text){

        myList.add(index,text);

    }

    public void addNumberToFirstPosition(List<Integer> myList, int value){

        myList.add(0,value);

    }

    public void returnValueAndIndexForList(List<Integer> myList){

        for (int i = 0; i < myList.size(); i++){
            System.out.println(" My index is: " + i + " and my value is: " +myList.get(i) );
        }

    }

    public int returnBiggestNumber(List<Integer> myList){

        int max = myList.get(0);

        for (int i = 0; i < myList.size(); i++){

            if (myList.get(i) > max){
                max = myList.get(i);
            }

        }

        return max;
    }

//  Tema optionala


    public List<Integer> reversealOfElements(List<Integer> myList){

        System.out.println(myList);

        return myList;
    }

    public List<Integer> returnEvenNumberFromList(List<Integer> myList){

        for (int i = 0; i < myList.size(); i++){

            if (myList.get(i) % 2 == 0){
                System.out.println(myList.get(i) + " ");
            }

        }

        return myList;

    }


    public List<Integer> returnNumberAscendingOrder(List<Integer> myList){

        for (int i = 0; i < myList.size(); i++){
            for (int j = i + 1; j < myList.size(); j++){

            int temp = 0;

            if (myList.get(i) > myList.get(j)){
                temp = myList.get(i);
//                myList.get(i) = myList.get(j);
//                myList.get(j) = temp;
            }

            }

        }
        return myList;
    }












}