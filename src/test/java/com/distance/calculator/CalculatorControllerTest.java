package com.distance.calculator;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(CalculatorController.class)
class CalculatorControllerTest {

    private String successReq;
    private String errorReq;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
        successReq = "{\n" +
                "  \"distances\": [\n" +
                "    {\n" +
                "      \"unit\": \"METER\",\n" +
                "      \"value\": 1\n" +
                "    },"+
                "    {\n" +
                "      \"unit\": \"FEET\",\n" +
                "      \"value\": 3\n" +
                "    }"+
                "  ],\n" +
                "  \"resultUnit\": \"METER\"\n" +
                "}";
        errorReq = "{\n" +
                "  \"distances\": [\n" +
                "    {\n" +
                "      \"unit\": \"METER\",\n" +
                "      \"value\": 1\n" +
                "    },"+
                "    {\n" +
                "      \"unit\": \"FEET\",\n" +
                "      \"value\": 3\n" +
                "    }"+
                "  ]\n"+
                "}";

    }

    @Test
    void addSuccess() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/api/distance-calculator/add")
                .accept(MediaType.APPLICATION_JSON)
                .content(successReq)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mvc.perform(request).andReturn();
        JSONObject resultJson = new JSONObject(result.getResponse().getContentAsString());
        System.out.println(resultJson.get("value"));

        assertEquals(200,result.getResponse().getStatus());
        assertEquals(1.91,resultJson.get("value"));
        assertEquals("METER", resultJson.get("unit"));

    }

    @Test
    void addBadMethod() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/api/distance-calculator/add")
                .accept(MediaType.APPLICATION_JSON)
                .content(errorReq)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals(400,result.getResponse().getStatus());
        System.out.println(result.getResponse().getContentAsString());

    }

}