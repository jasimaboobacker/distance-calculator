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

    private String reqJsonString;

    @Autowired
    private MockMvc mvc;

    @BeforeEach
    void setUp() {
        reqJsonString = "{\n" +
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
    }

    @Test
    void add() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("/api/distance-calculator/add")
                .accept(MediaType.APPLICATION_JSON)
                .content(reqJsonString)
                .contentType(MediaType.APPLICATION_JSON);
        MvcResult result = mvc.perform(request).andReturn();
        JSONObject resultJson = new JSONObject(result.getResponse().getContentAsString());
        System.out.println(resultJson.get("value"));
        assertEquals(1.91,resultJson.get("value"));
        assertEquals("METER", resultJson.get("unit"));

    }
}