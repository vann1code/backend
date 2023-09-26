package br.com.desafio.backend.Model;

import org.springframework.web.multipart.MultipartFile;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

public class ManipularXml {

    public Agentes convertXmlToObject(MultipartFile file) {

        Agentes agentes = null;
        try {
            String xml = new String(file.getBytes(), "UTF-8");
            JAXBContext jaxbContext = JAXBContext.newInstance(Agentes.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Desserializa o XML em um objeto Java
            agentes = (Agentes) unmarshaller.unmarshal(new StringReader(xml));

            // Agora você tem o conteúdo do XML como objetos Java
            System.out.println(agentes.getAgente().get(0).getCodigo());
            System.out.println(agentes.getAgente().get(0).getData());
            // Acesse outras propriedades conforme necessário

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return agentes;
    }
}
