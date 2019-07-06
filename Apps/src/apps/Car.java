/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Dataon
 */
public class Car {
    // definisi atribut
    int id=0;
    String no[];
    String color[];

    //define method init park lot
    void initLot(String val){
        if(val.contains("0") || id!=0){
            //tidak bisa insert 0 slot dan tidak bisa create lagi setelah lot terbentuk
            System.out.println("Cannot create 0 parking lot or parking lot already created!");
        }else{
            try{
                //hanya init jika input lot adalah int
                id = Integer.parseInt(val);
                no = new String[id];
                color = new String[id];

                System.out.println("Created a parking lot with "+id+" slots");
            }catch (NumberFormatException ex) {
                //handle exception here
                System.out.println("Failed to create a parking lot!");
            }
        }
    }
    
    //define method park
    void park(String car_no, String car_color){
        int i;
        for(i=0; i<id; i++){
            if(no[i]==null && color[i]==null){
                no[i] = car_no;
                color[i] = car_color;
                break;
            }
        }
        if(i<id){
            System.out.println("Allocated  slot number:" + (i+1));
        }else if(id == 0){
            System.out.println("Parking lot is not initialized yet!");
        }else{
            System.out.println("Sorry, parking lot is full");
        }
    }

    //define method leave
    void leave(String value){
        try{
            int val = Integer.parseInt(value)-1;
            if(no[val] == null && color[val] == null){
                System.out.println("Slot number "+value+" is empty");
            }else{
                no[val] = null;
                color[val] = null;
                System.out.println("Slot number "+value+" is free");
            }
        }catch(Exception ex){
            //handle exception here
            System.out.println("Failed to free a slot!");
        }
    }
    
    //define method status
    void status(){
        System.out.println("Slot No. Registration No Colour");
        for(int i=0; i<id; i++){
            if(no[i]!=null && color[i]!=null){
                System.out.println((i+1) +" "+ no[i] +" "+ color[i]);
            }
        }
    }
    
    //define registration no by color
    void getNoByColor(String col){
        ArrayList<String> listNo=new ArrayList<String>();
        for(int i=0; i<id; i++){
            if(color[i]!=null && color[i].toLowerCase().contains(col.toLowerCase())){
                listNo.add(no[i]); //list all reg no with same color
            }
        }
        if(listNo.size() > 0){
            System.out.println(Arrays.toString(listNo.toArray()).replace("[", "").replace("]", ""));
        }else{
           System.out.println("Not Found"); 
        }
    }
    
    //get slot by car color
    void getSlotByColor(String col){
        ArrayList<Integer> listSlot=new ArrayList<Integer>();
        for(int i=0; i<id; i++){
            if(color[i]!=null && color[i].toLowerCase().contains(col.toLowerCase())){
                listSlot.add(i+1); //list all slot with same color
            }
        }
        if(listSlot.size() > 0){
            System.out.println(Arrays.toString(listSlot.toArray()).replace("[", "").replace("]", ""));
        }else{
           System.out.println("Not Found");
        }
    }
    
    //get slot by registered car no
    void getSlotByNo(String carNo){
        int i;
        for(i=0; i<id; i++){
            if(no[i]!=null && no[i].contains(carNo)){
                System.out.println(i+1); //print first slot with registered no
                break;
            }
        }
        if(i==id){
            System.out.println("Not Found");
        }
    }
}