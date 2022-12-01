package myapp.ver1;

//fully qualified class name for java package io Console. 
import java.io.Console;

public class Hello {
    public static void main (String[] args){
        //get system console
        Console cons = System.console();
        
        //read from the console, the result is assigned to a variable
        String name = "";
        while (name.trim().length() <= 0){       
            name = cons.readLine("What is your name? ");
        }
        //equals() is for Strings, == is for number comparisons.
        if (name.trim().equals("fred")){
            System.out.println("Yabadabadoo");

        } else if (name.equals("barney")){
            System.out.println("Hello, Barney");

        }else{
            //send a greeting to the name using a formatted string. \n gives a new line. \t is TAB.
            System.out.printf("Hello, %s. \n \tNice to make your accquaintance.\n", name);

        }
        

    }
}



