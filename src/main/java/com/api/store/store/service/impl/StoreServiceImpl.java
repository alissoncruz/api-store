package com.api.store.store.service.impl;

import com.api.store.store.entity.StoreEntity;
import com.api.store.store.repository.StoreRepository;
import com.api.store.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public StoreEntity createStore(StoreEntity storeEntity) {
        StoreEntity store = storeRepository.save(storeEntity);
        return store;
    }
}
