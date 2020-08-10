package pe.com.vass.mock.app.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MockUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MockUtils.class);

    public static ObjectMapper createCustomObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        AnnotationIntrospector aiJaxb = new JaxbAnnotationIntrospector(TypeFactory.defaultInstance());
        AnnotationIntrospector aiJackson = new JacksonAnnotationIntrospector();
        // first Jaxb, second Jackson annotations
        mapper.setAnnotationIntrospector(AnnotationIntrospector.pair(aiJaxb, aiJackson));
        return mapper;
    }

    public static XmlMapper createXMLObjectMapper() {
        XmlMapper mapper = new XmlMapper();
        AnnotationIntrospector aiJaxb = new JaxbAnnotationIntrospector(TypeFactory.defaultInstance());
        AnnotationIntrospector aiJackson = new JacksonAnnotationIntrospector();
        // first Jaxb, second Jackson annotations
        mapper.setAnnotationIntrospector(AnnotationIntrospector.pair(aiJaxb, aiJackson));
        return mapper;
    }

    public static String JsonToString(Object object) {
        ObjectMapper mapper = createCustomObjectMapper();
        //ObjectMapper mapper = new ObjectMapper();
        //ObjectMapper mapper = ModelObjectMapper.createNewObjectMapper();
        mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
        try {
            String jsson = mapper.writeValueAsString(object);
            //return mapper.writeValueAsString(object);
            return jsson;

        } catch (JsonProcessingException e) {
            LOGGER.error(e.getMessage());
        }
        return "322";/////modify
    }

    public static String XmlToString(Object object) {
        XmlMapper mapper = createXMLObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return "";
    }


}
