public class LogicalOp {


    public int checkBiggerNumber(int firstNumber, int secondNumber){

        if(firstNumber > secondNumber){

            return firstNumber;
        }
        else {
            return secondNumber;
        }


    }


    public String compareText(String text){

        if(text.equals("FastTrack")){
            return "Learning text comparison";

        }

        else {
            return "Go to try some more";

        }

    }


    public String compareTextNumber (String text, int number){

        if(text.equals("FastTrackIT")  && number <= 3){

            return text + number;

        }

        else if(!text.equals("FastTrackIT") && number >= 4){


            return number + text;
        }


        return text;
    }



    public String compareNumber(int number){
        if((number > 8  || number == 6 )){

         return "The amount of snow this winter was(cm): " + number;

        }
        else{
            return "The forecast snow is(cm) " + number;
        }

    }


    public String compareNumberTwo(int number){
        if(number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";

        }
        else if (number == 4){
            return "The number is equal to 4";

        }

        else if(number < 3) {
            return "The number is lower than 3";
        }

        return "number";

    }

    public void   switchCase(int number) {

        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
                break;
            default:
                System.out.println("The number is higher");

        }


    }


    public boolean isNumberEven(int number){
        if(number % 2 == 0) {
            return true;
        }

        return false;

    }

    public boolean isEligibleToVote(int age){

        if (age >= 18){
            return true;
        }
        return false;

    }


    public int biggestNumber(int firstNumber, int secondNumber, int thirdNumber){

        if(firstNumber > secondNumber){
            return firstNumber;
        }
        else if (firstNumber > thirdNumber){
            return firstNumber;
        }
        else if (secondNumber > thirdNumber){
            return secondNumber;
        }
        return thirdNumber;

    }




}
