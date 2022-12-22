package practice18;

import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        try{
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
//        catch(Exception general){ //Остальные catch просто не нужны, потому что все ошибки пойманы
//            System.out.println("General exception");
//        }
        catch(ArithmeticException ae){
            System.out.println("Попытка деления на ноль");
        }catch (NumberFormatException nfe){
            System.out.println("Неправильный формат");
        }
        finally {
            System.out.println("Блок finally отрабатывает всегда");
        }
    }

    public static void main(String[] args){
        exceptionDemo();
    }
}

//Qwerty - NumberFormatException
//0 - ArithmeticException
//1.2 - NumberFormatException
//1. - NumberFormatException