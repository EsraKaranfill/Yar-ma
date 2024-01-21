package com.esra.Yarisma.service;

import com.esra.Yarisma.entity.Puanlama;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.repository.YarismaciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class YarismaciService {
    private final YarismaciRepository repository;
    public void save(Yarismaci yarismaci){
        repository.save(yarismaci);
    }
    public List<Yarismaci> findAll(){
        return repository.findAll();
    }
}
