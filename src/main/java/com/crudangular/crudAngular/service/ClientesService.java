/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crudangular.crudAngular.service;

import com.crudangular.crudAngular.model.Clientes;
import com.crudangular.crudAngular.repository.ClientesRepository;
import com.crudangular.crudAngular.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author macbookair
 */
@Service
public class ClientesService {
    @Autowired
    private ClientesRepository clientesRepository;
    
    public List<Clientes> getAllUsers() {
        return clientesRepository.findAll();
    }
    
    public Optional<Clientes> getUserById(Long id) {
        return clientesRepository.findById(id);
    }
    
    public Clientes saveUser(Clientes user) {
        return clientesRepository.save(user);
    }
    
    public void deleteUser(Long id) {
        clientesRepository.deleteById(id);
    }
    
}
