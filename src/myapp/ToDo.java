package myapp;

public class ToDo {
    public static void main(String[] args){
        //create an array of 3 string elements
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        // System.out.println(tasks); //doesn't print out anything useful
        // System.out.println(tasks[0]); //prints first item
        // System.out.println(tasks[1]);
        // System.out.println(tasks[2]);
        // System.out.println(tasks.length); //3

        //use a while loop to print the array
        Integer index = 0;
        while (index < tasks.length){
            System.out.printf("%d: %s\n", index, tasks[index]);
            index++;
        }

        
    }
    
}
