/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package platterisa;

/**
 *
 * @author pawan
 */

public class Plattertype implements Rectangle ,Circle , Square 
{

       
    double numcircle , numsquare ;
     
  
    double rectanglearea ,circlearea , squarearea ;
    double circleperimeter;
     
    public double gettotalarea(double length, double bredth) {
        return  rectanglearea=(length*bredth);
  
    }

   
    public double gettotalperimeter(double length, double bredth) {
        return 2*(length+bredth);
      
    }
   
    public double getcirclearea(double radius) {
        return (circlearea=(3.14*radius*radius)*numcircle );
        
    }

  
    public double getcircleperimeter(double radius) {
        return ((2*3.14*radius)*numcircle);
        
    }



    public double getsquarearea(double side) {
        return (squarearea=side*side*numsquare);
    }

 
    public double getsquareperimeter(double side) {
       return  (4*side*numsquare);
     
    }
    
    Plattertype(double numcircle , double numsquare )
    {
        this.numcircle=numcircle;
        this.numsquare=numsquare;        
    }
    
    double c1 ,c2 ,c3 , c4 ,c5 ,c6, c7;
    
    double getmetalused()
    {
           return c1=00*(rectanglearea-(squarearea+circlearea));
    }
    
    double getcirclefinishing()
    {
        return c2=15*circleperimeter;
    }
    double  getsquarefinishing()
    {
        return c3=10*numsquare;
    }
    
    double getlabour(double labour)
    {
        return c3=300*labour;
    }
    double getdelivary(double  distance )
    {
        return c4=100*distance;
    }
    double  getpacking(double numpack)
    {
        return c5=20*numpack;
    }
    double getbinding(double numbind)
    {
        return c6=10*numbind;
    }
    double getservicecharge()
    {
        return 0.18*(c1+c2+c3+c4+c5+c6+c7);
    }

    
    
}

