package nov28thpractice;

public class VariablePractice15 {
    public static void main(String[] args) {
        int a=15;
        int b=3;
        int c=7;
        int d=4;
        int e=2;

        //15+(3*7)-(4/2)+(15%3)
        //15+(3*7)-2+0
        //15+21-2+0
        int result = a+(b*c)-(d/e)+(a%b);

        System.out.println("The result of complex BODMAS operation is: " +result);
    }
}
