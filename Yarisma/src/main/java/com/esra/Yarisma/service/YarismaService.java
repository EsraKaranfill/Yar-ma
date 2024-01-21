package com.esra.Yarisma.service;

import com.esra.Yarisma.entity.Yarisma;
import com.esra.Yarisma.entity.Yarismaci;
import com.esra.Yarisma.repository.YarismaRepository;
import com.esra.Yarisma.repository.YarismaciRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class YarismaService {
    private final YarismaRepository repository;
    public void save(Yarisma yarisma){
        repository.save(yarisma);
    }
    public List<Yarisma> findAll(){
        return repository.findAll();
    }
}
