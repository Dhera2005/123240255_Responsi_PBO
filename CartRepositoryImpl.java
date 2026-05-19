/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.responsi.model;

import db.Koneksi;
import com.pbo.responsi.dto.CartIemDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CartRepositoryImpl extends CartRepository {

    @Override
    public CartTask getById(int id) {
        List<CartTask>list = new ArrayList<>();
        return null;
    }
    try{
        Connection conn = Koneksi.getConnection();
        
        String sql = "SELECT * FROM carts";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            CartTask taks = new CartTask(
                rs.getInt("id"),
                rs.getString("id"),
                rs.getString("id"),
            );           
            list.add(task);
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Boolean insert(Object insertCartItemDTO) {
        List<CartTask>list = new ArrayList<>();
    }
    try{
        Connection conn = Koneksi.getConnection();
        
        String sql = "SELECT * FROM carts";
        
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()){
            CartTask taks = new CartTask(
                rs.getInt("id"),
                rs.getString("id"),
                rs.getString("id"),
            );           
            list.add(task);
        } catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Boolean update(CartTask cartTask) {
        Connection conn = Koneksi.getConnection();
        
        String sql = "UPDATE carts SET title=?, status=? WHERE id=?";
    }

    @Override
    public Boolean deleteById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
