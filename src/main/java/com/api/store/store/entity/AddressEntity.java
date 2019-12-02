package com.api.store.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressEntity {
    private Long id;
    private String cep;
    private String street;
}
