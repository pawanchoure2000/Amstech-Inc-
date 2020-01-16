/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AccessModifier.Insidepackage;
/**
 *
 * @author pawan
 */
import com.AccessModifier.Outsidepackage.*;    //importing Outsidepackage  of projectname AcessModifier ........ 
import java.io.PrintStream;

   public  class BaseClass {
    
       
    
    static double  staticdefaultvariable =1 ;
    public static double  staticpublicvariable=2 ;
    protected static double  staticprotectedvariable=3;
    private static final double  staticprivatevariable=4;
    
    double defaultvariable=5;
    public  double  publicvariable=6;
    protected  double  protectedvariable=7;
    private final  double  privatevariable=8;
    
    
    static void  staticdefaultmethod()
    {
        System.out.println(" static default method  called !! ");
    }
    
    static public void staticpublicmethod()
    {
        System.out.println("static public  method  called !!  ");
    }
    
    static protected void staticprotectedmethod()
    {
        System.out.println("static protected  method called !!  ");
    }
    
    static private  void staticprivatemethod()
    {
        System.out.println("static private  method called !!   ");
    }
    
     void  defaultmethod()
    {
        System.out.println("default  method  called !! ");
    }
     
     public void publicmethod()
    {
        System.out.println("public  method called !!  ");
    }
    
      protected void protectedmethod()
    {
        System.out.println("protected  method called !!  ");
    }
      
      private  void privatemethod()
    {
        System.out.println("private  method called !!  ");
    }
      
    public static void main(String args[])
    {
        
         System.out.println("********************************ACEESSING   BASECLASS  INSIDEPACKAGE  **************************************");
        
        
        BaseClass   Baseobject = new BaseClass();
        System.out.println("static variable called from base class insidepackage ");
        System.out.println("staticdefaultvariable =" +staticdefaultvariable +"staticpublicvariable =" +staticpublicvariable +
                        "staticprotectedvariable ="+staticprotectedvariable +"staticprivatevariable="+ staticprivatevariable  );
        System.out.println("non-static variable from base class insidepackage ");
        System.out.println("defaultvariable ="+Baseobject.defaultvariable + "publicvariable ="+Baseobject.publicvariable 
                          +"protectedvariable ="+Baseobject.protectedvariable +"privatevariable ="+Baseobject.privatevariable  );
        
        System.out.println("static method called from base class insidepackage " );
        BaseClass.staticdefaultmethod();
        BaseClass.staticpublicmethod();
        BaseClass.staticprotectedmethod();
        BaseClass.staticprivatemethod();
        
        System.out.println("Non-Static method from BaseClass inisdepackage ");
        Baseobject.defaultmethod();
        Baseobject.publicmethod();
        Baseobject.protectedmethod();
        Baseobject.privatemethod();
        
        
       
        
        System.out.println("********************************ACEESSING   DERIVEDCLASS  INSIDEPACKAGE  **************************************");
        
        System.out.println("staic variable called from derived class insidepackage  via DerivedClass " );
        System.out.println("staticdefaultvariable ="+DerivedClass.staticdefaultvariable +"staticpublicvariable =" + DerivedClass.staticpublicvariable 
                             +"staticprotectedvariable ="+ DerivedClass.staticprotectedvariable  );
        System.out.println("SORRY!!!  saticprivatevariable can not be accessed in DerivedClass via DerivedClass");
        
        System.out.println("staic variable called from derived class insidepackage  via BaseClass ");
        System.out.println("staticdefaultvariable ="+ BaseClass.staticdefaultvariable  +"staticpublicvariable ="+ BaseClass.staticpublicvariable 
                           +"staticprotectedvariable ="+ BaseClass.staticprotectedvariable +"staticprivatevariable = "+BaseClass.staticprivatevariable  );
        System.out.println("CONGRULATION!!! saticprivatevariable can  be accessed in DerivedClass via BaseClass");
        
        
        System.out.println( "Non-Static variable from DerivedClass insidepackage");
        System.out.println("defaultvariable ="+DerivedObject.defaultvariable +"publicvariable ="+DerivedObject.publicvariable +
                "protectedvariable ="+ DerivedObject.protectedvariable +"privatevariable ="+DerivedObject.privatevariable );
        
        System.out.println("static method called from base class insidepackage via DerivedClass ");
        DerivedClass.staticdefaultmethod() ; 
        DerivedClass.staticpublicmethod();
        DerivedClass.staticprotectedmethod();
        System.out.println("SORRY!! staticprivatemethod() can not be accessed in DerivedClass via DerivedClass ");
        
        
        System.out.println("Non-Static method from DerivedClass  inisdepackage ");
       // DerivedObject.defaultmethod();   //EXCEPTION 
        //DerivedObject.publicmethod();   //EXCEPTION 
        //DerivedObject.protectedmethod();   //EXCEPTION 
        System.out.println("SORRY!! privatemethod() can  not be accessed in DerivedClass  ");  
        
        System.out.println("********************************ACEESSING   NON-DERIVEDCLASS  INSIDEPACKAGE  **************************************");
        System.out.print(" static variable called from Non-Derived class insidepackage");  
        System.out.println("staticdefaultvariable ="+NonDerivedClass.staticdefaultvariable  +"staticpublicvariable ="+ NonDerivedClass.staticpublicvariable 
                          +"staticprotectedvariable ="+NonDerivedClass.staticprotectedvariable + "staticprivatevariable ="+NonDerivedClass.staticprivatevariable  );
        
        System.out.print("Non-Static variable from Non-DerivedClass insidepackage");
        System.out.println(" defaultvariable ="+ NonDerivedObject.defaultvariable +" publicvariable ="+ NonDerivedObject.publicvariable
                +" protectedvariable ="+  NonDerivedObject.protectedvariable +" privatevariable ="+ NonDerivedObject.privatevariable  );
        
        
        System.out.print(" static method called from Non-Derived class insidepackage");
        //NonDerivedClass.staticdefaultmethod();  //EXCEPTION 
        //NonDerivedClass.staticpublicmethod();    //EXCEPTION 
        //NonDerivedClass.staticprotectedmethod();   //EXCEPTION 
        //NonDerivedClass.staticprivatemethod();     //EXCEPTION 
        
        System.out.println("Non-Static method from Non-DerivedClass  inisdepackage");
        //NonDerivedCObject.defaultmethod();    //EXCEPTION 
        //NonDerivedObject.publicmethod();    //EXCEPTION 
        //NonDerivedObject.protectedmethod();    //EXCEPTION 
        //NonDerivedObject.privatemethod();    //EXCEPTION  
        
        System.out.println("********************************ACEESSING   DERIVEDCLASS  OUTSIDEPACKAGE  **************************************");
 
        System.out.println("static variable called from OutsideDerived class outsidepackage via  OutsideDerivedClass");
        System.out.println("SORRY!!!  saticdefaultvariable can not be accessed in OutsideDerivedClass via OutisdeDerivedClass" );
        System.out.println("staticpublicvariable ="+  OutsideDerivedClass.staticpublicvariable +"staticprotectedvariable"+ OutsideDerivedClass.staticprotectedvariable );
        System.out.println("SORRY!!!  saticprivatevariable can not be accessed in DerivedClass via OutsideDerivedClass");
        
       System.out.println("non-static variable called from OutsideDerived Class outsidepacakage ");
       System.out.println("defaultvariable ="+OutsideDerivedObject.defaultvariable+" publicvariable="+OutsideDerivedObject.publicvariable
                          +" protectedvariable=" +OutsideDerivedObject.protectedvariable +" privatevariable=" + OutsideDerivedObject.privatevariable ) ;            
      
       System.out.println("static method called from Non-Derived class ourtsidepackage");
       //OutsideDerivedClass.staticdefaultmethod();   //EXCEPTION   
       OutsideDerivedClass.staticpublicmethod();     
       OutsideDerivedClass.staticprotectedmethod();      
       //OutsideDerivedClass.staticprivatemethod();     //EXCEPTION 
       
       System.out.println("non-static method called from derived class outside package ");
      //OutsideDerivedObject.defaultmethod();   //EXCEPTION   
      // OutsideDerivedObject.publicmethod();   //EXCEPTION   
      //OutsideDerivedObject.protectedmethod();   //EXCEPTION   
      //OutsideDerivedObject.privatemethod();   //EXCEPTION   
     
       System.out.println("********************************ACEESSING   NON-DERIVEDCLASS  OUTSIDEPACKAGE  **************************************");
       System.out.println("static variable called from Non-Derived Class Outsidepackage ");
       System.out.println("staticdefaultvariable ="+OutsideNonDerivedClass.staticdefaultvariable  +"staticpublicvariable ="+ OutsideNonDerivedClass.staticpublicvariable 
                          +"staticprotectedvariable ="+OutsideNonDerivedClass.staticprotectedvariable + "staticprivatevariable ="+OutsideNonDerivedClass.staticprivatevariable  );
       
       System.out.println("non-static variable called from Non-derived Class Outsidepackaeg ");
       System.out.println("defaultvariable ="+ OutsideNonDerivedObject.defaultvariable +"publicvariable ="+ OutsideNonDerivedObject.publicvariable
                +"protectedvariable ="+  OutsideNonDerivedObject.protectedvariable +"privatevariable ="+ OutsideNonDerivedObject.privatevariable  );
       
       System.out.print(" static method called from Non-Derived class outsidepackage");
        //OutsideNonDerivedClass.staticdefaultmethod();  //EXCEPTION 
        //OutsideNonDerivedClass.staticpublicmethod();    //EXCEPTION 
        //OutsideNonDerivedClass.staticprotectedmethod();   //EXCEPTION 
        //OutsideNonDerivedClass.staticprivatemethod();     //EXCEPTION 
        
        System.out.println("Non-Static method from Non-DerivedClass  outsidepackage");
        //OutsideNonDerivedObject.defaultmethod();    //EXCEPTION 
        //NonDerivedObject.publicmethod();    //EXCEPTION 
        //NonDerivedObject.protectedmethod();    //EXCEPTION 
        //NonDerivedObject.privatemethod();    //EXCEPTION  

               
       
    }

}
