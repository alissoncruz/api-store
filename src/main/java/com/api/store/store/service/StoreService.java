package com.api.store.store.service;

import com.api.store.store.entity.StoreEntity;

public interface StoreService {

    StoreEntity createStore(StoreEntity storeEntity);

    StoreEntity getStore(Long id);

    StoreEntity updateStore(Long id, StoreEntity entity);

}
