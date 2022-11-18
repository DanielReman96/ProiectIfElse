import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

//        Calculator calc = new Calculator();
//
//        System.out.println("Diferenta este " + calc.diference(4,2));
//        System.out.println("Suma este " + calc.sum(4,2));
//        System.out.println("Produsul este " + calc.multiplication(4,2));
//        System.out.println("Rezultatul impartirii este" + calc.divide(4,2));
//
        LogicalOp compare = new LogicalOp();

//        int biggest = compare.checkBiggerNumber(7,7);
//        System.out.println("Numarul cel mai mare este " + biggest);
//
//        String aText = compare.compareText("Daniel");
//        System.out.println(aText);
//
//
//        String compVariable = compare.compareTextNumber(" Daniel ", 4);
//        System.out.println(compVariable);
//
//        String compNumberVariable = compare.compareNumber(9);
//        System.out.println(compNumberVariable);
//
//        String compNumberTwoVariable = compare.compareNumberTwo(4);
//        System.out.println(compNumberTwoVariable);
//
//        compare.switchCase(5);
//
//        String numberEvenVariable = String.valueOf(compare.isNumberEven(9));
//        System.out.println(numberEvenVariable);
//
//        String eligibleToVoteVariable = String.valueOf(compare.isEligibleToVote(1));
//        System.out.println(eligibleToVoteVariable);
//
//
//        int biggestNumberVariable = compare.biggestNumber(7,4,5);
//        System.out.println("The biggest number is " + biggestNumberVariable);
//
//        compare.numberToHundred(50);
//        compare.numberToNegativeHundred(10);
//        compare.numberToNumber(3,34);
//        compare.numberToBiggestNumber(100,109);
//        compare.evenNumberToHundred();
//        compare.oddNumberToHundred();
//        System.out.println(compare.sumOfNumber(90));
//        System.out.println(compare.sumAndAverage(1));
//        compare.pyramid(5);
//        compare.inversePyramid(5);

//        compare.whileNumberToHundred(90);
//        compare.whileNumberNegativeHundred(20);
//        compare.whileNumberToNumber(60,50);
//        compare.whileNumberToBiggestNumber(49,45);
//        compare.whileEvenNumber();
//        compare.whileOddNumber();
//        compare.numberToNumberSumAndAverage();
//        compare.divisibleSeven(6, 100);
//        compare.numberFibonacci();
//        compare.cozaLozaWoza();

//        compare.getOneToHundredArray();

//        int[] myFirstArray = compare.setEvenNumberArray(100);
//        compare.printEvenNumberArray(myFirstArray);

//        int[] myAverageArray = compare.numberForAverageArray(100);
//        compare.getAverageArrayNumber(myAverageArray);
//        System.out.println(compare.averageNumberArray(myAverageArray));

//        String[] arrayValue = {"Dan","Markus","Dani", "Martin", "Emi"};
//        System.out.println(compare.checkStringArray(arrayValue,"Markuss"));

//        int[] myArray = compare.numberArray(100);
//        System.out.println(compare.checkNumberReturnPosition(myArray,100));


//            compare.myGridLine();

//        int[] myArrayEight = compare.myArrayExEight(10);
//         compare.checkMyArrayAndReturnWithoutNumber(myArrayEight,4);




//        compare.getSecondLowestNumber(compare.myArraySecondLowest);

//        int[] myEmptyArray = new int[10];
//        int[] myFullArray = {99,18,78,61,50,45,37,22,15,10};
//
//       compare.myEmptyArray(compare.myCopyArray(myFullArray,myEmptyArray));




//        compare.elementInPosition(3,10);
//        compare.maxAndMinArray(compare.myMinMaxArray);
//        compare.myInversionArray(compare.myMinMaxArray);
//        compare.myDuplicateValueOfArray(compare.myMinMaxArray);
//        compare.returnCommonString(compare.myFirstStringArray, compare.mySecondStringArray);
//        compare.returnOrderedNumbers(compare.unorderedNumbers);



        List<String> myList = new ArrayList<>();
        myList.add(0,"Dan");
        myList.add(1,"Daniel");
        myList.add(2,"Markus");
        myList.add(3,"Martin");
//
//        compare.printListElement(myList);

        List<Integer> mySecondList = new ArrayList<>();
        mySecondList.add(0,1);
        mySecondList.add(1,4);
        mySecondList.add(2,5);
        mySecondList.add(3,7);
//        compare.numberTheEndOfTheList(mySecondList,5);




//        compare.printElementFromNumber(mySecondList,1);
//        compare.printReversDisplayElement(mySecondList);

//        compare.addToStringToPosition(myList,1,"Kevin");
//        System.out.println(myList);

//        compare.addNumberToFirstPosition(mySecondList,555);
//        System.out.println(mySecondList);

//        compare.returnValueAndIndexForList(mySecondList);
        int biggestNumber = compare.returnBiggestNumber(mySecondList);
        System.out.println(" The biggest number is:  " + biggestNumber + " from my List: " + mySecondList);



















    }







}