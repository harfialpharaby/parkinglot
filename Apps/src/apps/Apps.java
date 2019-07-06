/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

/**
 *
 * @author Dataon
 */
public class Apps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        { 
            // Just one line and you are done !  
            // We have given a command to start cmd 
            // /K : Carries out command specified by string 
           Runtime.getRuntime().exec(new String[] {"cmd", "/K", "Start"}); 
  
        } 
        catch (Exception e) 
        { 
            System.out.println("HEY Buddy ! U r Doing Something Wrong "); 
            e.printStackTrace(); 
        } 
    }
    
}
