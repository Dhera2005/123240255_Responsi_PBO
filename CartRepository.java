/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.responsi.model;

import com.pbo.responsi.dto.CartItemDTO;
import java.util.List;

/**
 *
 * @author farhannivta
 */
public abstract class CartRepository {
    public abstract CartTask getById(int id);
    
    public abstract Boolean insert(InsertCartItemDTO insertCartItemDTO);
    
    public abstract Boolean update(CartTask cartTask);
    
    public abstract Boolean deleteById(int id);
    
    //List<CartItemDTO> findAll();
    //void save(CartItemDTO item);
    //void updateQuantity(String name, int newQty);
    //void delete(String name);
}
