package com.example.demo.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TicketEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private int numero;
    private LocalDate date ;
    private int nbCouvert ;
    private float addition ;

    @ManyToOne()
    private TableEntity table;

    @ManyToOne
    private MetEntity client;

    @ManyToMany(mappedBy = "tickets")
    @JsonIgnore
    private List<com.example.demo.Models.Met.MetEntity> mets;


}
