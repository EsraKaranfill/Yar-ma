package com.esra.Yarisma.service;

import com.esra.Yarisma.entity.Soru;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.repository.SoruRepository;
import com.esra.Yarisma.repository.YarismaciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SoruService {
    private final SoruRepository repository;
    public void save(Soru soru){
        repository.save(soru);
    }
    public List<Soru> findAll(){
        return repository.findAll();
    }
}
