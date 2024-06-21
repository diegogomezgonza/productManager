package com.mycompany.appjava.logic;

import com.mycompany.appjava.logic.Persistence.Persistence;
import java.util.List;

public class Controller {
    
    //Objeto para el controlador de persistencia
    Persistence persistenceController = new Persistence();

    public void save(String productName, String productPrice, String productDescription) {
        //Instancias para cada clase
        //Clase cliente
        Client client = new Client();
        //Utilizo los argumentos que recibe el método guardar para asignarlos a las propiedades de la clase cliente
        client.setName(clientName);
        
        //Clase producto
        Product product = new Product();
        product.setName(productName);
        product.setPrice(productPrice);
        product.setDescription(productDescription);
        product.setState(available);
        //Hago que el contenido de newClient sea el objeto cliente que he creado anteriormente
        product.setNewClient(client);
        
        //Guardar en la BD
        persistenceController.save(client, product);
    }

    //Crear metodo para recoger productos en JPA
    public List<Product> getProduct() {
        return persistenceController.getProduct();
    };

    //Se envía el id del cliente para eliminar el producto concreto
    public void deleteProduct(int idClient) {
       persistenceController.deleteProduct(idClient);
    }

    public Product getSingleProduct(int idClient) {
       return persistenceController.getSingleProduct(idClient);
    }

    //Guardar el producto editado
    public void saveProduct(Product prod, String productName, String clientName, String productPrice, String productDescription, String available) {
        prod.setName(productName);
        prod.setClient(clientName);
        prod.setPrice(available);
        prod.setDescription(productDescription);
        prod.setState(available);
        
        //Guardar cambios
        persistenceController.saveProduct(prod);
        
        //Guardar el nombre cliente
        Client cl = this.findClient(prod.getIdClient());
        cl.setName(clientName);
        
        //Modificar información llamando al método
        this.saveClient(cl);
    }

    private Client findClient(int idClient) {
        return persistenceController.findClient(idClient);
    }

    private void saveClient(Client cl) {
        persistenceController.saveClient(cl);
    }
}
