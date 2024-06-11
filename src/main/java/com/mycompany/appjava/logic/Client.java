/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appjava.logic;

/**
 *
 * @author d
 */
public class Client {
    //Id y nombre del cliente
    private int idClient;
    private String name;

    //Constructor
    public Client() {
        
    }

    public Client(int idClient, String name) {
        this.idClient = idClient;
        this.name = name;
    }
    
    //Getter y setter

    public int getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
