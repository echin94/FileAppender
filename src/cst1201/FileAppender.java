/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst1201;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author class
 */
public class FileAppender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("midgrade.txt", true);
        
        PrintWriter printWriter = new PrintWriter("midgrade.txt");
        printWriter.println("More Stuff");
        printWriter.close();
        
        File inputFile = new File("midgrade.txt");
        Scanner scanner = new Scanner(inputFile);
        
        /*
        for (int i = 0; i < 4; i++){
            String aLine = scanner.nextLine();
            System.out.println(aLine);
        }
        */
        
        while (scanner.hasNextLine()) { //if there's a next line
            String aLine = scanner.nextLine(); //get the next line and print it
            System.out.println(aLine); //print it
        }
    }
    
}
