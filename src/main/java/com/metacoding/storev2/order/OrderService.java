package com.metacoding.storev2.order;

import com.metacoding.storev2.store.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class OrderService {
    private StoreRepository storeRepository;
    private OrderRepository orderRepository;
    public void 구매하기(int storeId, int userId, int qty) {
        storeRepository.findById(storeId);

    }
}
