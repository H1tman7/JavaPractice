package practice18;

import java.util.Objects;
import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        while (true){
            String key = myScanner.nextLine();
            try{
                printDetails(key);
                break;
            }
            catch (Exception e){
                System.out.println("Возникла некоторая ошибка");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }catch(Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String [] args){
        ThrowsDemo obj = new ThrowsDemo();
        obj.getKey();
    }
}