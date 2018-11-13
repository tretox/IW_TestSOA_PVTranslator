/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Carlos
 */
@Named(value = "campanyaBean")
@Dependent
public class CampanyaBean {

    /**
     * Creates a new instance of CampanyaBean
     */
    public CampanyaBean() {
    }
    
    public String doAtras(){
        return "index.xhtml";
    }
    
}
