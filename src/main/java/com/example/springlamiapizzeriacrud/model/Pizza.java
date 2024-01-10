package com.example.springlamiapizzeriacrud.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Pizza")
public class Pizza{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
@Column (nullable = false)
private String name;
private String description;
private BigDecimal price;
private String urlFoto;

public Integer getId() {
        return id;
        }

public void setId(Integer id) {
        this.id = id;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getDescription() {
        return description;
        }

public void setDescription(String description) {
        this.description = description;
        }

public BigDecimal getPrice() {
        return price;
        }

public void setPrice(BigDecimal price) {
        this.price = price;
        }

public String getUrlFoto() {
        return urlFoto;
        }

public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
        }
        }
