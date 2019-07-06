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
public class Car {
    // definisi atribut
    int id;
    int no;
    int color;

    //define method park
    void park(){
        System.out.println(id +" is running...");
        System.out.println("Speed: "+ no);
    }

    //define method leave
    void leave(){
        System.out.println(id +" is running...");
    }
    
    //define method init park lot
    void initLot(String val){
        try{
            id = Integer.parseInt(val);
            System.out.println("Created a parking lot with "+id+" slots");
        }catch (NumberFormatException ex) {
            //handle exception here
            System.out.println("Failed created a parking lot");
        }
    }
    
    
}
