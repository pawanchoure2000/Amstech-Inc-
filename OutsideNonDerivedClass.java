/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.AccessModifier.Outsidepackage;

import com.AccessModifier.Insidepackage.BaseClass;

/**
 *
 * @author pawan
 */
public class OutsideNonDerivedClass {

    public static String staticdefaultvariable;
    public static String staticpublicvariable;
    public static boolean staticprivatevariable;
    public static String staticprotectedvariable;

   
    BaseClass   OutsideNonDerivedobject = new BaseClass();
    
   
}
