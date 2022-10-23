public class Main {


    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Diferenta este " + calc.diference(4,2));
        System.out.println("Suma este " + calc.sum(4,2));
        System.out.println("Produsul este " + calc.multiplication(4,2));
        System.out.println("Rezultatul impartirii este" + calc.divide(4,2));

        LogicalOp compare = new LogicalOp();

        int biggest = compare.checkBiggerNumber(7,7);
        System.out.println("Numarul cel mai mare este " + biggest);

        String aText = compare.compareText("Daniel");
        System.out.println(aText);


        String compVariable = compare.compareTextNumber(" Daniel ", 4);
        System.out.println(compVariable);

        String compNumberVariable = compare.compareNumber(9);
        System.out.println(compNumberVariable);

        String compNumberTwoVariable = compare.compareNumberTwo(4);
        System.out.println(compNumberTwoVariable);

        compare.switchCase(5);

        String numberEvenVariable = String.valueOf(compare.isNumberEven(9));
        System.out.println(numberEvenVariable);

        String eligibleToVoteVariable = String.valueOf(compare.isEligibleToVote(1));
        System.out.println(eligibleToVoteVariable);


        int biggestNumberVariable = compare.biggestNumber(7,4,5);
        System.out.println("The biggest number is " + biggestNumberVariable);


    }







}