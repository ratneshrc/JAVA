public class Fact {
    public static void main(String[] arg){
        int a=7;
        int fact=1;
        for(int i=a;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of 7 is " + fact);
    }

}
