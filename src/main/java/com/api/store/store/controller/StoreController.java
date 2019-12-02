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

import static org.hibernate.query.criteria.internal.ValueHandlerFactory.convert;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class StoreController extends BaseController implements StoresApi {

    @Autowired
    private StoreService storeService;

    @Override
    public ResponseEntity<StoreCodeTO> createStore(@Valid NewStoreTO newStore) {
        System.out.println("Create store");

        StoreEntity storeEntity = convert(newStore, StoreEntity.class);

        StoreEntity entity = storeService.createStore(storeEntity);

        StoreCodeTO response = convert(entity, StoreCodeTO.class);

        return new ResponseEntity<>(response, CREATED);
    }

    @Override
    public ResponseEntity<StoreTO> getStore(String code) {
        System.out.println("Get store");
        return null;
    }

    @Override
    public ResponseEntity<Void> updateStore(String code, @Valid UpdateStoreTO store) {
        System.out.println("Update store");
        return null;
    }
}
