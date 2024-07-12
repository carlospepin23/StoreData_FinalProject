package com.ironhack.midterm_project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "The product must have a name")
    private String name;
    @NotNull(message = "The product must have a price")
    @Min(value = 0, message = "The price must be greater than zero (0)")
    private Double price;
    @NotNull(message = "The product stock cannot be null")
    @Min(value = 0, message = "The stock must be equal or greater than zero (0)")
    private Integer stock;

    public Product(String name, Double price, Integer stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

}
