/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author Dataon
 */
public class Apps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        String Commands;
        
        // membuat objek player
        Car parking = new Car();

        // Enter Commands and press Enter
        Commands = myObj.nextLine();
        
        if(Commands.contains(" ")){
            Commands = Commands.substring(0, Commands.indexOf(" "));
            System.out.println("Commands is: " + Commands + " and length: "+ Commands.length());
        }
    }
}
