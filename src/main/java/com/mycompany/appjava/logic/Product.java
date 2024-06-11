/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appjava.logic;

/**
 *
 * @author d
 */
public class Product {
    
    //Propiedades de un producto
    private String name;
    private String client;
    private int idClient;
    private int price;
    private String description;
    
    //Necesito hacer relaciones de 1 a 1 ya que una mascota solo puede un dueño
    private Client newClient;

    //Constructor
    public Product() {
    }

    public Product(String name, String client, int idClient, int price, String description, Client newClient) {
        this.name = name;
        this.client = client;
        this.idClient = idClient;
        this.price = price;
        this.description = description;
        this.newClient = newClient;
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

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Client getNewClient() {
        return newClient;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }
    
    
}
