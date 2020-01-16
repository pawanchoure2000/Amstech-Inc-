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
public class NonDerivedClass {

    static String staticdefaultvariable;
    static String staticpublicvariable;
    static boolean staticprivatevariable;
    static String staticprotectedvariable;


    BaseClass NonDerivedObject;

    public NonDerivedClass() {
        this.NonDerivedObject = new BaseClass();
    }
    
    
    
    
}
