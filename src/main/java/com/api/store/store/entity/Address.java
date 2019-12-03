package com.api.store.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name="address")
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue
    private Long id;

    private String cep;

    private String street;
}
