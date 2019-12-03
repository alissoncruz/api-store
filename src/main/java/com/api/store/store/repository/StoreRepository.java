package com.api.store.store.repository;

import com.api.store.store.entity.StoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Long> {
}
