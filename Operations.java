class Operations{

    public static void main(String[] args) {

        Addition sum = new Addition();
        Subtraction diff = new Subtraction();
        Multiplication product = new Multiplication();
        Division divide = new Division();

        sum.executeOperation(Float.parseFloat(args[0]),
                                Float.parseFloat(args[1]), sum.symbol);
        diff.executeOperation(Float.parseFloat(args[0]),
                                Float.parseFloat(args[1]), diff.symbol);
        product.executeOperation(Float.parseFloat(args[0]),
                                Float.parseFloat(args[1]), product.symbol);
        divide.executeOperation(Float.parseFloat(args[0]),
                                Float.parseFloat(args[1]), divide.symbol);
    }
    

}


class Addition extends Calculator{
    public String symbol = "+";


}

class Subtraction extends Calculator{
    public String symbol = "-";

}
class Multiplication extends Calculator{

    public String symbol = "*";

}

class Division extends Calculator{
    public String symbol = "/";

}