/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Carlos
 */
@Named(value = "sessionBean")
@SessionScoped
public class SessionBean implements Serializable {

    /**
     * Creates a new instance of SessionBean
     */
    public SessionBean() {
    }
    
}
