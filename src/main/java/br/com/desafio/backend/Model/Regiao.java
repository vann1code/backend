package br.com.desafio.backend.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@Entity
@Table(name = "regioes")
public class Regiao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agente_id")
    private Agente agente;
    @Column(name = "sigla")
    private String sigla;

    @ElementCollection
    @CollectionTable(name = "geracao", joinColumns = @JoinColumn(name = "regiao_id"))
    @Column(name = "valor")
    private List<Double> geracao;
    @ElementCollection
    @CollectionTable(name = "compra", joinColumns = @JoinColumn(name = "regiao_id"))
    @Column(name = "valor")
    private List<Double> compra;
    @ElementCollection
    @CollectionTable(name = "preco_medio", joinColumns = @JoinColumn(name = "regiao_id"))
    @Column(name = "valor")
    private List<Double> precoMedio;

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
