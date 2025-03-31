package com.metacoding.storev2.store;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StoreService {
    private final StoreRepository storeRepository;

    public List<Store> 상품목록() {
        List<Store> productList = storeRepository.productList();
        return productList;
    }
    public Store 물건상세(int id) {
    Store productDetail = storeRepository.findById(id);
    return productDetail;
    }

}
