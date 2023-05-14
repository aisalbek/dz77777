import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static BancAcaunt bancAcaunt = new BancAcaunt();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String stop = "";
        comands();
        while (!stop.equals("x")) {
            stop = scanner.nextLine();
            swich(stop);
        }
//        System.out.println();
    }

    public static void swich(String p) {
        switch (p) {
            case "1":
                System.out.println("сколько хотите пополнить.  ");
                System.out.print("ведите суму :");
                try {
                    bancAcaunt.popolnit(scanner.nextInt());
                }catch (InputMismatchException e ){
                    System.out.println("-----------------------------------------");
                    System.out.println("вы задали не число !!!");
                    System.out.println("-----------------------------------------");
                }
                comands();
                break;
            case "2":
                try {
                    System.out.println("сколько хотите вывести.  ");
                    System.out.print("ведите суму :");
                    bancAcaunt.snyat(scanner.nextInt());
                }catch (InputMismatchException e ){
                    System.out.println("-----------------------------------------");
                    System.out.println("вы задали не число !!!");
                    System.out.println("-----------------------------------------");
                }
                comands();
                break;
            case "3":
                bancAcaunt.proverkaBalans();
                comands();
                break;
//            default :
//                System.out.println("-----------------------------------------");
//                System.out.println("вы задали другое число !!!");
//                System.out.println("-----------------------------------------");
        }
    }

    public static void comands() {
        System.out.println(" Пополнить денги нажмите   : (1)");
        System.out.println(" Снять денги нажмите       : (2)");
        System.out.println(" Проверить баланс нажмите  : (3)");
        System.out.println(" Останавить просес нажмите : (х)");
    }

}