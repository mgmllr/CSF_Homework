import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        IntLinkedList linkedList = new IntLinkedList();
        menu(linkedList);
    }

    public static void menu(IntLinkedList linkedList){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("(a)dd a number or (q)uit");
            String input = scanner.next();
            if(input.equals("a")){
                System.out.println("add n");
                int n = scanner.nextInt();
                linkedList.insert(n);
                linkedList.print();
            } else if(input.equals("q")) {
                break;
            } else {
                System.out.println("please input 'a' or 'q'");
            }
        }
    }
}
