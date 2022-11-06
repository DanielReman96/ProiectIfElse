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
//
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
//
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

    public void whileNumberToHundred(int number) {
        while (number <= 100) {


            System.out.println(number);
            number++;

        }


    }

    public void whileNumberNegativeHundred(int number) {
        while (number >= -100) {

            System.out.println(number);
            number--;

        }


    }


    public void whileNumberToNumber(int firstNumber, int secondNumber) {
        while (firstNumber < secondNumber) {

            System.out.println(firstNumber);
            firstNumber++;

        }
        while (firstNumber >= secondNumber) {

            System.out.println(secondNumber);
            secondNumber++;
        }

    }

    public void whileNumberToBiggestNumber(int firstNumber, int secondNumber) {

        while (firstNumber > secondNumber) {
            System.out.println(secondNumber);
            secondNumber++;

        }

        while (firstNumber <= secondNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }

    }

    public void whileEvenNumber() {
        int number = 1;
        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;

        }
    }

    public void whileOddNumber() {
        int number = 0;
        while (number <= 100) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
            number++;

        }

    }

    public void numberToNumberSumAndAverage() {
        int firstNumber = 111;
        int secondNumber = 8899;
        float sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            sum = sum + firstNumber;
            count++;
            firstNumber++;

        }
        System.out.println(sum);
        System.out.println(count);
        float average = sum / count;
        System.out.println(average);

    }


    public float divisibleSeven(int firstNumber, int secondNumber) {
        int count = 0;
        float sum = 0;
        while (firstNumber <= secondNumber) {

            if (firstNumber % 7 == 0) {

                sum = sum + firstNumber;
                System.out.println(firstNumber);
                count++;
            }

            firstNumber++;

        }
        float average = sum / count;
        System.out.println(count);
        System.out.println(sum);
        System.out.println(average);

        return average;
    }


    public void numberFibonacci() {
        int firstNumber = 0;
        int secondNumber = 1;
        int count = 0;
        System.out.print(firstNumber + " " + secondNumber);

        while (count < 10) {

            int thirdNumber = firstNumber + secondNumber;
            System.out.print(" " + thirdNumber);
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            count++;

        }


    }


    public void cozaLozaWoza() {
        int countNumber = 0;
        int countRow = 0;
        int firstNumber = 1;


        while (firstNumber <= 110) {

            System.out.print(" " + firstNumber++);


            if (firstNumber % 3 == 0) {
                firstNumber = Integer.parseInt((" Coza "));
            } else if (firstNumber % 5 == 0) {
                firstNumber = Integer.parseInt(" Loza ");
            } else if (firstNumber % 7 == 0) {
                firstNumber = Integer.parseInt(" Woza ");
            } else if (firstNumber % 3 == 0 && firstNumber % 5 == 0) {
                firstNumber = Integer.parseInt(" CozaLoza ");
            } else if (firstNumber % 3 == 0 && firstNumber % 7 == 0) {
                firstNumber = Integer.parseInt(" CozaWoza ");
            } else if (firstNumber % 5 == 0 && firstNumber % 7 == 0) {
                firstNumber = Integer.parseInt(" WozaLoza ");
            } else if (firstNumber % 3 == 0 && firstNumber % 5 == 0 && firstNumber % 7 == 0) {
                firstNumber = Integer.parseInt(" CozaLozaWoza ");
            }

            firstNumber++;
        }
    }
}