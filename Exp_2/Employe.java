public class Employe{
String firstName;
String lastName;
int monthlySalary;


Employe(String f,String l,int s){
firstName=f;
lastName=l;
if(s<0)
monthlySalary=0;
else
monthlySalary=s;
}

void setter(){
monthlySalary=monthlySalary+(monthlySalary*10/100);
}

void getter(){
System.out.println("First name: "+firstName);
System.out.println("Last name: "+lastName);
System.out.println("Monthly salary: "+monthlySalary);
System.out.println("Yearly salary: "+(monthlySalary*12));
}


public static void main(String[] args){
Employe em1=new Employe("EMP1","emp1",60000);
Employe em2=new Employe("EMP2","emp2",50000);
em1.getter();
em1.setter();
System.out.println("After 10% raise:");
em1.getter();
System.out.println();
em2.getter();
em2.setter();
System.out.println("After 10% raise:");
em2.getter();
}
}
