package com.esra.Yarisma.repository;

import com.esra.Yarisma.entity.Puanlama;
import com.esra.Yarisma.entity.Yarismaci;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuanlamaRepository extends JpaRepository<Puanlama,Long> {
    /**
     * select * from tbl_puanlama order by puan desc limit 1
     */
    Puanlama findTopByOrderByPuanDesc();
}
