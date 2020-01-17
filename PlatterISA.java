/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platterisa;

import java.util.Scanner;

/**
 *
 * @author pawan
 */
public class PlatterISA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        Plattertype Platter1 = new Plattertype(2.0 , 4.0 );  //num of circle and square passed as argument 
        
       Plattertype Platter2 = new Plattertype(2.0 , 0.0 );    //num of circle and square passed as argument
        System.out.println("***************************showing property of platter1 ************************");
        
        System.out.println("total outer  boundry =" + Platter1.gettotalperimeter(6.5, 8.2) );
        System.out.println("toatal inner inner  boundry ="+Platter1.getcircleperimeter(1.5) + Platter1.getsquareperimeter(0.5) );
        System.out.println("total circle inner  boundry ="+ (Platter1.getcircleperimeter(1.5))  );
        System.out.println("total square inner boundry ="+ (Platter1.getsquareperimeter(0.5)) );
        System.out.println("Individual square inner boundry ="+Platter1.getsquareperimeter(0.5)/4.0 );
        System.out.println("Individual circle inner boundry =" +Platter1.getcircleperimeter(0.5)/2.0);
        
        System.out.println("Total circle area ="+Platter1.getcirclearea(0.5));
        System.out.println("Toatl square  area ="+Platter1.getsquarearea(0.5));
        System.out.println("Platter area of 1st platter "+  (Platter1.gettotalarea(6.5, 8.2)-  (Platter1.getcirclearea(1.5)+Platter1.getcirclearea(0.5))  )  );
        
        System.out.println("metal cost ="+Platter1.getmetalused());
        System.out.println("cost of circle finishing ="+Platter1.getcirclefinishing());
        System.out.println("cost for the number of square hole "+Platter1.getsquarefinishing());
        System.out.println("labour cost NOTE:(No.of labour passed in parameter here 2 )"+Platter1.getlabour(2.0));
        System.out.println("Delivary cost NOTE:(Distance passed in parameter here 5)"+Platter1.getdelivary(5.0));
        System.out.println("Packing cost NOTE:(NUumber of item packed passed in parameter here 10)"+Platter1.getpacking(4.0));
        System.out.println("Binding cost NOTE:(NUumber of item bind passed in parameter here 2"+Platter1.getbinding(2.0));
        System.out.println("Total Service charged(18%)[9%-GST+9%CGST] based on above staus  "+Platter1.getservicecharge());
        
        
        
        //System.out.println("meta used ="Platter1.getmetalused());
        
        System.out.println("***********************showing property of platter2 *************************");
      
        System.out.println("total outer  boundry =" + Platter2.gettotalperimeter(8.5, 11.5) );
        System.out.println("toatal inner inner  boundry ="+Platter2.getcircleperimeter(2.5)  );
        System.out.println("total circle inner  boundry ="+ (Platter1.getcircleperimeter(2.5))  );
        System.out.println("total square inner boundry ="+ (Platter1.getsquareperimeter(0.0)) );
        System.out.println("Individual square inner boundry ="+Platter1.getsquareperimeter(0.0)/4.0 );
        System.out.println("Individual circle inner boundry =" +Platter1.getcircleperimeter(2.5)/2.0);
        
        System.out.println("Total circle area ="+Platter1.getcirclearea(2.5));
        System.out.println("Toatl square  area ="+Platter1.getsquarearea(0.0));
        System.out.println("Platter area of 2nd platter "+  (Platter1.gettotalarea(6.5, 8.2)-  (Platter1.getcirclearea(2.5)+Platter1.getcirclearea(0.0))  )  );
        
        
        System.out.println("metal cost ="+Platter2.getmetalused());
        System.out.println("cost of circle finishing ="+Platter2.getcirclefinishing());
        System.out.println("cost for the number of square hole "+Platter2.getsquarefinishing());
        System.out.println("labour cost NOTE:(No.of labour passed in parameter here 2 )"+Platter2.getlabour(2.0));
        System.out.println("Delivary cost NOTE:(Distance passed in parameter here 5)"+Platter2.getdelivary(5.0));
        System.out.println("Packing cost NOTE:(NUumber of item packed passed in parameter here 10)"+Platter2.getpacking(4.0));
        System.out.println("Binding cost NOTE:(NUumber of item bind passed in parameter here 2"+Platter2.getbinding(2.0));
        System.out.println("Total Service charged(18%)[9%-GST+9%CGST] based on above staus  "+Platter2.getservicecharge());
        
        
        
        
    }
    
}
