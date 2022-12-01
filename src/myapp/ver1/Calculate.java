package myapp.ver1;

import java.io.Console;

public class Calculate {
    public static void main(String[] args){
        //get  for inputs
        Console cons = System.console();
        
        //read from the console, the result is assigned to a variable
        String input = "";

        // int count = 0;
        int results = 0;

        // while (count < 3){ 
        //     while (input.trim().length() <= 0){       
        //         input = cons.readLine("Enter a number: ");
        //     }
        //     int num = Integer.parseInt(input);
        //     results += num;
        //     count += 1;
        //     input = "";
        // }
        //// method 2 (my method)=========================================
        // while (!input.trim().equals("stop")){ 
        //     while (input.trim().length() <= 0){       
        //         input = cons.readLine("Enter a number: ");
        //     }
        //     if (input.trim().equals("stop")){
        //         break;
        //     }
        //     results += Integer.parseInt(input);
        //     input = "";
        //     // System.out.println(results);
        // }
        // method 3 (teacher's cleaner method) =============================================
        Integer count = 0;

        while (true){
            input = cons.readLine("Please enter a number:");
            input = input.trim();
            if (input.equals("stop")){
                break;
            }
            count ++; //counts the number of inputs 
            results += Integer.parseInt(input);
        }

    
        System.out.printf("The total of adding %d number: %d", count, results);
    }
}
