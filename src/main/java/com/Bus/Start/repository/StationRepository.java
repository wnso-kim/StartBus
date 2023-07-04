package com.Bus.Start.repository;


import com.Bus.Start.domain.Station;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StationRepository {
    private final EntityManager em;

    // Create =============================================
    public void save(Station station) {
        em.persist(station);
    }

    // Read ===============================================
    public Station findOne(int id) {
        return em.find(Station.class, id);
    }

    public List<Station> findAll() {
        return em.createQuery("select b from Station b", Station.class)
                .getResultList();
    }

    public List<Station> findByName(String name){
        return em.createQuery("select m from Station m where m.name = :name", Station.class)
                .setParameter("name", name)
                .getResultList();
    }

    // Update =============================================


    // Delete =============================================

}
