package br.com.desafio.backend.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@Entity
@Table(name = "Regiao")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String sigla;

    @ElementCollection
    @CollectionTable(name = "Geracao")
    private List<Double> geracao;

    @ElementCollection
    @CollectionTable(name = "Compra")
    private List<Double> compra;

    @ElementCollection
    @CollectionTable(name = "PrecoMedio")
    private List<Double> precoMedio;

    @ManyToOne
    private Agente agente;

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlAttribute
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlElementWrapper(name = "geracao")
    @XmlElement(name = "valor")
    public List<Double> getGeracao() {
        return geracao;
    }

    public void setGeracao(List<Double> geracao) {
        this.geracao = geracao;
    }

    @XmlElementWrapper(name = "compra")
    @XmlElement(name = "valor")
    public List<Double> getCompra() {
        return compra;
    }

    public void setCompra(List<Double> compra) {
        this.compra = compra;
    }

    @XmlElementWrapper(name = "precoMedio")
    @XmlElement(name = "valor")
    public List<Double> getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(List<Double> precoMedio) {
        this.precoMedio = precoMedio;
    }
}
