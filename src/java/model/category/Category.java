/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.category;

import java.sql.Date;

/**
 *
 * @author IVAN
 */
public class Category {
    private int id;
    private String name;
    private Date CreatedAt;  

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", CreatedAt=" + CreatedAt + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(Date CreatedAt) {
        this.CreatedAt = CreatedAt;
    }
    
    
}
