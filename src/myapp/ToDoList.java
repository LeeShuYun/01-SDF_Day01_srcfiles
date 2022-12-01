package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class ToDoList{

    public static void main (String[] args){
        //create a list of numbers
        List<Integer> listOfInt = new LinkedList<>();
        
        //get the console
        Console cons = System.console();

        String item = "";

        while (true){
            item = cons.readLine("Please enter a number: ");
            item = item.trim();

            if ("stop".equals(item)) //because stop is a string we can call equals on it.
                break;

            //add item to list
            listOfInt.add(Integer.parseInt(item));
        }

        //size() gives the length of a linked list
        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for (Integer index = 0; index < listOfInt.size(); index++){
                System.out.printf("[%d]: %d\n" ,index, listOfInt.get(index));
        }


    }
}