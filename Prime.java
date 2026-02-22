public class Prime {
    public static void main(String[] arg){
        int a=2;
        if (a>11)
        {
        if(a%2==0||a%3==0||a%5==0||a%7==0||a%11==0)
        {
          System.out.println("Number is composite");
        } 
        else 
        {
          System.out.println("Number is prime");
        }
        }
        else if (a==2||a==3||a==5||a==7||a==11)
        {
          System.out.println("Number is prime");
        }
    }
}

            
    

