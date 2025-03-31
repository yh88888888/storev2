package com.metacoding.storev2.store;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class StoreRepository {
    private final EntityManager em;

    public List<Store> productList() {
        String sql = "select id, name, stock, price from store_tb";
        Query query = em.createNativeQuery(sql, Store.class);
        System.out.println(query);
        return query.getResultList();
    }

    public Store findById(int id) {
        String sql = "select id, name, stock, price from store_tb where id = ?";
        Query query = em.createNativeQuery(sql, Store.class);
        query.setParameter(1, id);
        try{
        return (Store)query.getSingleResult();}
        catch(Exception e){
            return null;
        }

    }

}
