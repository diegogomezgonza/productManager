package com.mycompany.appjava.logic.Persistence;

import com.mycompany.appjava.logic.Client;
import com.mycompany.appjava.logic.Product;

/**
 *
 * @author d
 */
public class Persistence {
    
    //Objetos para la clases de persistencia
    ClientJpaController clientJpa = new ClientJpaController();
    ProductJpaController productJpa = new ProductJpaController();

    public void save(Client client, Product product) {
        //Uso de métodos (crear en la BD el cliente y el producto)
        clientJpa.create(client);
        productJpa.create(product);
    }
}
