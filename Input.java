import java.util.Scanner;

public class Input {
    static Scanner input = new Scanner(System.in);


    public static int inputInt(String mensagem){
        int i;

        while(true){
            try{
                System.out.println(mensagem);
                i = Integer.parseInt(input.nextLine());
                break;
            }catch(Exception  e){
                System.out.println("Opss você digitou algo errado tente novamente");
            }     
        }
        
        return i;
    }

    public static double inputDouble(String mensagem){
        double i;

        while(true){
            try{
                System.out.println(mensagem);
                i = Double.parseDouble(input.nextLine());
                break;
            }catch(Exception  e){
                System.out.println("Opss você digitou algo errado tente novamente");
            }     
        }
        
        return i;
    }

    public static String inputString(String mensagem){
        String i;

        while(true){
            try{
                System.out.println(mensagem);
                i = input.nextLine();
                break;
            }catch(Exception  e){
                System.out.println("Opss você digitou algo errado tente novamente");
            }     
        }
        
        return i;
    }
}