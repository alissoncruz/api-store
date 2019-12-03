package com.api.store.store.controller;


import com.api.store.api.StoresApi;
import com.api.store.model.NewStoreTO;
import com.api.store.model.StoreCodeTO;
import com.api.store.model.StoreTO;
import com.api.store.model.UpdateStoreTO;
import com.api.store.store.entity.StoreEntity;
import com.api.store.store.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static com.api.store.store.utils.ParserUtil.convertValue;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
public class StoreController extends BaseController implements StoresApi {

    @Autowired
    private StoreService storeService;

    @Override
    public ResponseEntity<StoreCodeTO> createStore(@Valid NewStoreTO newStore) {
        System.out.println("Create store");
        StoreEntity storeEntity = convertValue(newStore, StoreEntity.class);
        StoreEntity entity = storeService.createStore(storeEntity);
        StoreCodeTO response = convertValue(entity, StoreCodeTO.class);
        return new ResponseEntity<>(response, CREATED);
    }
    
    @Override
    public ResponseEntity<StoreTO> getStore(Long id) {
        System.out.println("Get store");
        StoreEntity entity = storeService.getStore(id);
        StoreTO response = convertValue(entity, StoreTO.class);
        return  new ResponseEntity<>(response, OK);
    }

    @Override
    public ResponseEntity<Void> updateStore(Long id, UpdateStoreTO store) {
        storeService.updateStore(id, convertValue(store, StoreEntity.class));
        System.out.println("Update store");
        return new ResponseEntity<>(OK);
    }
}
