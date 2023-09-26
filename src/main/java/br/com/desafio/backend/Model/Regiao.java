package br.com.desafio.backend.Model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

public class Regiao {
    private String sigla;
    private List<Double> geracao;
    private List<Double> compra;
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
