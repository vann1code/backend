package br.com.desafio.backend.Model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "agentes")
public class Agentes {
    private List<Agente> agente;

    @XmlElement(name = "agente")
    public List<Agente> getAgente() {
        return agente;
    }

    public void setAgente(List<Agente> agente) {
        this.agente = agente;
    }
}
