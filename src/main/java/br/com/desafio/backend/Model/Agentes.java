package br.com.desafio.backend.Model;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Table(name = "Agentes")
@XmlRootElement(name = "agentes")
public class Agentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agentes")
    private List<Agente> agente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(name = "agente")
    public List<Agente> getAgente() {
        return agente;
    }

    public void setAgente(List<Agente> agente) {
        this.agente = agente;
    }
}
