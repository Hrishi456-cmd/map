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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer addressId;
    private String addressName;
    private String phoneNumber;
    private String zipcode;
    private String state;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user id",referencedColumnName = "userId")
    private User userId;
}
