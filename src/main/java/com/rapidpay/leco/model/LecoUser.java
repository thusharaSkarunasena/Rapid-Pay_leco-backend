package com.rapidpay.leco.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class LecoUser implements Serializable {

    @Id
    private int id;
    private String account_number;
    private String name;
    private String nic;
    private String address;
    private String other;
}
