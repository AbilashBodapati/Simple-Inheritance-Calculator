class Calculator{

    public void executeOperation(float num1, float num2, String symbol) {
        if (symbol.equals("+")){
            System.out.println("Sum of numbers: " + (num1+num2));

        }else if (symbol.equals("-")){
            System.out.println("Difference of numbers: " + (num1-num2));

        }else if (symbol.equals("*")){
            System.out.println("Product of numbers: "+ (num1*num2));

        }else if (symbol.equals("/")){
            if (num2 != 0){
                System.out.println("Quotient of numbers: " + (num1/num2));
            }else{
                System.out.println("Can not divide by 0");
            }
            
        }

    }

}