/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hm.cs.schnitzel.reflection;

/**
 *
 * @author nicfel
 */
public @interface RenderMe {

    public String with() default "edu.hm.cs.schnitzel.reflection.Renderer";
    
}