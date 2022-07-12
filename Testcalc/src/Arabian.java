import java.util.Scanner;

public class Arabian {
    Scanner scanner=new Scanner(System.in);
    int num1;
    char operation;
    int num2;

    public int calculator(int num1,char operation,int num2){
        int result;
        switch (operation){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result = num1 * num2;
                break;
                case '/':
                    result = num1 / num2;
                    break;
            default:
                System.out.println("Error");
                result=calculator(num1,operation,num2);
            }
            return result;
        }

        public int getInt(){
           int num;
           if (scanner.hasNextInt()){
               num=scanner.nextInt();
           }else {
               System.out.println("Error");
               scanner.next();
               num=getInt();
           }
           return num;
        }

        public  char getOperation(){
           char operation;
           if (scanner.hasNext()){
               operation=scanner.next().charAt(0);
           }else {
               System.out.println("Error");
               scanner.next();
               operation=getOperation();
           }
           return operation;
        }
}
