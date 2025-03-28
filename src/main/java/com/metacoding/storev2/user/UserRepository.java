package com.metacoding.storev2.user;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;


@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final EntityManager em;

    public User findByUsername(String username) {
        String sql = "select * from user_tb where username = ?";
        Query query = em.createNativeQuery(sql, User.class);
        query.setParameter(1, username);
        try {
            return (User) query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
     }

    public void save(String username, String password, String fullname) {
        String sql= "insert into user_tb(username, password, fullname, created_at) values(?,?,?,now())";
        Query query = em.createNativeQuery(sql);
        query.setParameter(1, username);
        query.setParameter(2, password);
        query.setParameter(3, fullname);
        query.executeUpdate();
    }
}
