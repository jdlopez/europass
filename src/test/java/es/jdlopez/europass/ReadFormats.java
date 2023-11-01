package es.jdlopez.europass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadFormats {
    @Test
    public void readJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> obj = new TreeMap<>();
        obj.put("id", "something");
        obj.put("another", "something");
        obj.put("anotherone", "something");
        obj.put("anothertwo", "something");
        obj.put("another3", "something");
        JsonNode node = objectMapper.readTree(objectMapper.writeValueAsString(obj));
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("id",
                SimpleBeanPropertyFilter.filterOutAllExcept("id")
        );
        objectMapper.setFilterProvider(filterProvider);
        System.out.println(
        objectMapper.writerWithDefaultPrettyPrinter().with(filterProvider) //.withoutAttribute("id")
                .writeValueAsString(node)
        );
    }
}
