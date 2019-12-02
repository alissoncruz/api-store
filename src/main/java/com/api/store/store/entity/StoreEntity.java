
package com.api.store.store.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoreEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

   // private AddressEntity addressEntity;
}
