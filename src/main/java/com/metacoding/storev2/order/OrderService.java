package com.metacoding.storev2.order;

import com.metacoding.storev2.store.Store;
import com.metacoding.storev2.store.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class OrderService {
    private StoreRepository storeRepository;
    private OrderRepository orderRepository;

    public void 구매하기(int storeId, int userId, int qty) {
        Store store = (Store) storeRepository.findById(storeId);
        if(store == null) throw new RuntimeException("재고량이 부족합니다. 다음 입고일을 기다려주세요");
//        재고량 조절
        store.재고감소(qty);


    }
}