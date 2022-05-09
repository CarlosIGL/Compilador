package sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionErrorDeAritmetica extends RuntimeException  {

    public ExceptionErrorDeAritmetica(String s){
        System.out.println(s);
    }
}
