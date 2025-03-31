package com.metacoding.storev2.store;

import jakarta.persistence.Column;



public class StoreRequest {
    @Column(unique = true, nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, length = 12)
    private Integer stock;
    @Column(nullable = false, length = 12)
    private Integer price;
}
