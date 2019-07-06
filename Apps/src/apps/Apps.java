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
        
        // membuat objek player
        Car parking = new Car();

        String Commands=null;
        do{
            // Enter Commands and press Enter
            Commands = myObj.nextLine();
            String[] splitCommand = Commands.split(" ");
            switch(splitCommand[0]){
                case "create_parking_lot":
                    parking.initLot(splitCommand[1]);
                    break;
                case "park":
                    parking.park(splitCommand[1], splitCommand[2]);
                    break;
                case "leave":
                    parking.leave(splitCommand[1]);
                    break;
                case "status":
                    parking.status();
                    break;
                case "registration_numbers_for_cars_with_colour":
                    parking.getNoByColor(splitCommand[1]);
                    break;
                case "slot_numbers_for_cars_with_colour":
                    parking.getSlotByColor(splitCommand[1]);
                    break;
                case "slot_number_for_registration_number":
                    parking.getSlotByNo(splitCommand[1]);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println(splitCommand[0]+" command doesn't exist!");
                    break;
            }
        }while(!Commands.contains("exit"));
    }
}
