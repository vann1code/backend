package br.com.desafio.backend.Model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.List;

public class ExtrairDatas {
    public static List<String> extrairDatas(Document document) {
        NodeList dataList = document.getElementsByTagName("data");
        List<String> datas = new ArrayList<>();

        for (int i = 0; i < dataList.getLength(); i++) {
            Element dataElement = (Element) dataList.item(i);
            String dataText = dataElement.getTextContent();
            datas.add(dataText);
        }

        return datas;
    }
}