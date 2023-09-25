package br.com.desafio.backend.Model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.List;

public class ExtrairCodigos {
    public static List<String> extrairCodigos(Document document) {
        NodeList codigoList = document.getElementsByTagName("codigo");
        List<String> codigos = new ArrayList<>();

        for (int i = 0; i < codigoList.getLength(); i++) {
            Element codigoElement = (Element) codigoList.item(i);
            String codigoText = codigoElement.getTextContent();
            codigos.add(codigoText);
        }

        return codigos;
    }
}
