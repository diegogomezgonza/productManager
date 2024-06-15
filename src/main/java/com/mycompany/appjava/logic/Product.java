/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appjava.logic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author d
 */
// Al marcar mi clase como entidad, me permite poder pasarla como tabla a la bd
@Entity
public class Product {
    
    //Propiedades de un producto
    //ID del cliente
    //Al indicar que su estrategia será SEQUENCE, generará los id de forma secuencial
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idClient;
    
    //Nombre de la mascota
    private String name;
    private String client;
    private String price;
    private String description;
    private String state;
    
    //Necesito hacer relaciones de 1 a 1 ya que una mascota solo puede un dueño
    @OneToOne
    private Client newClient;

    //Constructor
    public Product() {
    }

    public Product(String name, String client, int idClient, String price, String description, Client newClient, String state) {
        this.name = name;
        this.client = client;
        this.idClient = idClient;
        this.price = price;
        this.description = description;
        this.newClient = newClient;
        this.state = state;
    }
    
    //Getter y setter

    public String getName() {
        return name;
    }

    public String getClient() {
        return client;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Client getNewClient() {
        return newClient;
    }

    public String getState() {
        return state;
    }
   
  

    public void setName(String name) {
        this.name = name;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
