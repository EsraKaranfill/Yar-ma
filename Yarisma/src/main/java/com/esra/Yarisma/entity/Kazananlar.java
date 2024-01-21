package com.esra.Yarisma.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_kazananlar")
public class Kazananlar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long yarismaId;
    Long yarismaciId;
    Integer siralama;
    String odul;
}
