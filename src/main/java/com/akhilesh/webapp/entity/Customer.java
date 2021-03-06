/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.webapp.entity;

import java.io.Serializable;

/**
 *
 * @author Akhilesh
 */
public class Customer implements Serializable{
    private int id;
    private String firstName, lastName;
    private boolean status;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, boolean status) {
        this.id = id;
        this.firstName = firstName; 
        this.lastName = lastName;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    public String getfullName (){
        return firstName+" "+ lastName;
    }
    
}
