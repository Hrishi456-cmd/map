package com.example.Ecommerce.API.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer orderId;
    private Integer userId;
    private Integer productId;
    private Integer addressId;
    private Integer productQuantity;
}
