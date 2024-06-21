package com.mycompany.appjava.logic.Persistence;

import com.mycompany.appjava.logic.Client;
import com.mycompany.appjava.logic.Product;
import java.util.List;

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

    //Método JPA para recuperar los productos
    public List<Product> getProduct() {
        return productJpa.findProductEntities();
    }

    //Método JPA para eliminar los productos
    public void deleteProduct(int idClient) {
        productJpa.destroy(idClient);
    }

    public Product getSingleProduct(int idClient) {
        return productJpa.findProduct(idClient);
    }

    public void saveProduct(Product prod) {
        productJpa.edit(prod);
    }

    public Client findClient(int idClient) {
        return clientJpa.findClient(idClient);
    }

    public void saveClient(Client cl) {
        clientJpa.edit(cl);
    }
}
