package com.esra.Yarisma.repository;

import com.esra.Yarisma.entity.Kazananlar;
import com.esra.Yarisma.entity.Yarismaci;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface KazananlarRepository extends JpaRepository<Kazananlar,Long> {
    /**
     * select count(*) from tblogrenci where yas > 15
     */
    @Query("select count(o) from Ogrenci o where o.yas> ?1")
    Integer kacOgrenciVar(Integer yas);

}
