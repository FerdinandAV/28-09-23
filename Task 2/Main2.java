import java.util.Scanner;
class Main{
    public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Please type your name");
    String name = scanner.nextLine();

System.out.println("Please type your age");
    String age = scanner.nextLine();
    



    System.out.println("Name: " + name);
    System.out.println(" Age: " + age);

int retirementAge = 67-Integer.parseInt(age);
System.out.println("Years until retirement: " + retirementAge + " Years");

}
    }