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
    private Long id;


    @OneToMany(mappedBy = "agentes", cascade = CascadeType.ALL)
    @XmlElement(name = "agente")
    private List<Agente> agente;


    public List<Agente> getAgente() {
        return agente;
    }

    public void setAgente(List<Agente> agente) {
        this.agente = agente;
    }
}
