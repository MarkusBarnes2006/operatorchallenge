public class Operator {
    public static void main(String[] args) {
        double val1 = 20.00;
        double val2 = 80.7;
        double val3 = (val1 + val2) * 100.00;

        System.out.println("My values total = " + val3);
        double remainder = val3 % 40.00;

        boolean remainderOrNot = (remainder == 0) ? true : false;
        System.out.println("remainderOrNot = " + remainderOrNot);

        String s = (remainderOrNot) ? "Has remainder" : "Doesn`t have remainder";
        System.out.println(s);

        if(!remainderOrNot) {
            System.out.println("Got some remainder");
        }
    }
}
