package br.com.desafio.backend.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;
@Entity
@Table(name = "Agente")
public class Agente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "agentes_id")
    private Agentes agentes;
    @Column(name = "codigo")
    private int codigo;
    @Column(name = "data")
    private String data;
    @OneToMany(mappedBy = "agente", cascade = CascadeType.ALL)
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
