import java.util.Scanner;

public class Calculator {

    public double checkTax(int housePrice, Tax taxRange){
        double taxFee1 = 0;
        double taxFee2 = (housePrice - taxRange.getFirstRangeEnd())*0.02;
        double taxFee3 = (taxRange.getSecondRangeEnd()-taxRange.getFirstRangeEnd())*0.02 + (housePrice - taxRange.getSecondRangeEnd())*0.05;
        double taxFee4 = (taxRange.getSecondRangeEnd()-taxRange.getFirstRangeEnd())*0.02 + (taxRange.getThirdRangeEnd()-taxRange.getSecondRangeEnd())*0.05 + (housePrice - taxRange.getThirdRangeEnd())*0.1;
        double taxFee5 = (taxRange.getSecondRangeEnd()-taxRange.getFirstRangeEnd())*0.02 + (taxRange.getThirdRangeEnd()-taxRange.getSecondRangeEnd())*0.05 + (taxRange.getFourthRangeEnd() - taxRange.getThirdRangeEnd())*0.1 + (housePrice - taxRange.getFourthRangeEnd())*0.12;

        if(housePrice >= taxRange.getFirstRangeStart() && housePrice <= taxRange.getFirstRangeEnd()){
           return taxFee1;
        }
        else if(housePrice >= taxRange.getSecondRangeStart() && housePrice <= taxRange.getSecondRangeEnd()){
            return taxFee2;
        }
        else if(housePrice >= taxRange.getThirdRangeStart() && housePrice <= taxRange.getThirdRangeEnd()){
            return taxFee3;
        }
        else if(housePrice >= taxRange.getFourthRangeStart() && housePrice <= taxRange.getFourthRangeEnd()){
            return taxFee4;
        }
        else{
            return taxFee5;
        }   
    }
    public static void main(String[] args) {
        Tax taxRange = new Tax(0, 145000, 145001, 250000, 250001, 325000, 325001, 750000, 750001);
        System.out.print("please enter the house price:  ");
        Scanner obj = new Scanner(System.in);
        int housePrice = obj.nextInt();
        Calculator calculator = new Calculator();
        System.out.println(calculator.checkTax(housePrice,taxRange)); 
    }
}