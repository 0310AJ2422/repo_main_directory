package code_directory.java_code.io;

import java.util.HashMap;
import java.io.Console;
import java.util.Map;

public class consoleProject{
    private static Map<String ,Double> map=new HashMap<>();
    private static Console con=System.console();
     
    public static void main(String aj[]){
        while(true){
            System.out.println("system command ->");
            String command=con.readLine();
            switch(command){

                case "add":
                    addexpence();
                    break;
                case "view":
                    viewtotal();
                    break;
                case "ctge":
                    catogoriesexpenses();
                    break;
                case "exit":
                    System.exit(0);
                default :
                    System.out.println(command+"is a invalid command ");
            }
        }
    }
    public static void printmenu(){
        System.out.println("----------------manu-----------------");
        System.out.println("1. add expenses command add ");
        System.out.println("2. view total expenses command view");
        System.out.println("3. catogories expenses command ctge");
        System.out.println("4. exit command exit");
    }

    public static void addexpence(){
        String discription=con.readLine();
        double amount=Double.parseDouble(con.readLine());

        map.put(discription,amount);
        System.out.println("Expenses add succesfully");
    }

    public static void viewtotal(){
        if(map.isEmpty()){
            System.out.println("no Expenses record");
        }
        else{
            double total=map.values().stream().mapToDouble(Double::doubleValue).sum();
            System.out.println("Total expenses"+total);
        }
    }

    public static void catogoriesexpenses(){
        if(map.isEmpty()){
            System.out.println("");
        }
        else{
            System.out.println("catogories expenses ");
            map.forEach((discription,amount)->System.out.println(discription+": $"+amount));
        }
    }
}
