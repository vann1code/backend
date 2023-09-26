package br.com.desafio.backend.Model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Agente {
    private int codigo;
    private String data;
    private List<Regiao> regiao;

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
