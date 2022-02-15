package java;
import java.util.Scanner;

public class StaticBlock{
    static Scanner scanner = new Scanner(System.in);
    static int breadth = scanner.nextInt();
    static int height = scanner.nextInt();
    static boolean flag = true;
    
    static {
        try{
            if(breadth <= 0 || height <= 0){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        if(flag){
            int area = breadth * height;
            System.out.println(area);
        }
    }
}