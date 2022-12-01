//the name of the package
package myapp;

//imports put them here

//Class definition - every file contains only one class. name of class is name of file
//if you write the wrong name hover over tooltip will tell you the full filepath of the file
public class MyFirstApp{
    //entry point for our app - every class can have an entry point
    public static void main (String[] args){
        System.out.println("Hello, World");
        System.out.println("Hello, Java");
    }
}

//command line for compiling this 
//javac -sourcepath src -d classes src/myapp/*
//this will determine the source of your source files
//javac -sourcepath src 
//this will be the destination folder for our compiled .class files, which is classes here
//-d classes
//compile everything inside src/myapp/
//src/myapp/* 
//compile a specific java file
//src/myapp/Main.java

//to run the file. -cp defines the class path, 
//then the fully qualified classname, package.classfilename myapp.MyFirstapp
//package names are usually in lowercase
// java -cp classes myapp.MyFirstApp 