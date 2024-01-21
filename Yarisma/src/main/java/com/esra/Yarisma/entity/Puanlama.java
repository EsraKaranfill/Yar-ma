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
@Table(name = "tbl_puanlama")
public class Puanlama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long yarismaciId;
    Long yarismaId;
    Long puan;
}
