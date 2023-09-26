package br.com.desafio.backend.Model;

import javax.persistence.*;

@Entity
@Table(name = "valores")
public class Valor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "regiao_id")
    private Regiao regiao;

    @Column(name = "valor")
    private Double valor;

}