package com.api.store.store.service.impl;

import com.api.store.store.entity.StoreEntity;
import com.api.store.store.repository.StoreRepository;
import com.api.store.store.service.StoreService;
import javassist.NotFoundException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.util.Optional;

@Service("storeService")
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreRepository storeRepository;

    @Override
    public StoreEntity createStore(StoreEntity storeEntity) {
        StoreEntity store = storeRepository.save(storeEntity);
        return store;
    }

    @Override
    public StoreEntity getStore(Long id) {
        Optional<StoreEntity> store = storeRepository.findById(id);
        if(!store.isPresent()){
            throw new ObjectNotFoundException(id,"Store not found");
        }
        return store.get();
    }

    @Override
    public StoreEntity updateStore(Long id, StoreEntity entity) {
        StoreEntity update = getStore(id);
        update.setName(entity.getName());
        storeRepository.save(update);
        return update;
    }
}
