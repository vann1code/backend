package br.com.desafio.backend.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@Entity
@Table(name = "Agente")
public class Agente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "agentes_id") // Nome da coluna que representa o relacionamento
    private Agentes agentes; // Adicione este campo para o relacionamento inverso

    private int codigo;
    private String data;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agente")
    private List<Regiao> regiao;

    public Agentes getAgentes() {
        return agentes;
    }

    public void setAgentes(Agentes agentes) {
        this.agentes = agentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @XmlElement
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @XmlElement(name = "regiao")
    public List<Regiao> getRegiao() {
        return regiao;
    }

    public void setRegiao(List<Regiao> regiao) {
        this.regiao = regiao;
    }
}
