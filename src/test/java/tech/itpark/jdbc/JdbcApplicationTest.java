package tech.itpark.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class JdbcApplicationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    void crudTest() throws Exception {
        mockMvc.perform(get("/cars"))
                .andExpect(
                        content()
                                .json("[\n" +
                                        "  {\n" +
                                        "    \"id\": 1,\n" +
                                        "    \"vendorId\": 1,\n" +
                                        "    \"name\": \"Rio\",\n" +
                                        "    \"price\": 800,\n" +
                                        "    \"power\": 99,\n" +
                                        "    \"bodyType\": \"sedan\",\n" +
                                        "    \"equip\": \"standard\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"white\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 2,\n" +
                                        "    \"vendorId\": 1,\n" +
                                        "    \"name\": \"Picanto\",\n" +
                                        "    \"price\": 700,\n" +
                                        "    \"power\": 85,\n" +
                                        "    \"bodyType\": \"hatcback\",\n" +
                                        "    \"equip\": \"standard\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"black\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 3,\n" +
                                        "    \"vendorId\": 1,\n" +
                                        "    \"name\": \"Cerato\",\n" +
                                        "    \"price\": 700,\n" +
                                        "    \"power\": 124,\n" +
                                        "    \"bodyType\": \"sedan\",\n" +
                                        "    \"equip\": \"premium\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"red\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 4,\n" +
                                        "    \"vendorId\": 1,\n" +
                                        "    \"name\": \"Ceed\",\n" +
                                        "    \"price\": 1100,\n" +
                                        "    \"power\": 125,\n" +
                                        "    \"bodyType\": \"hatcback\",\n" +
                                        "    \"equip\": \"standard\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"gray\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 5,\n" +
                                        "    \"vendorId\": 2,\n" +
                                        "    \"name\": \"Granta\",\n" +
                                        "    \"price\": 600,\n" +
                                        "    \"power\": 87,\n" +
                                        "    \"bodyType\": \"hatcback\",\n" +
                                        "    \"equip\": \"standard\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"green\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 6,\n" +
                                        "    \"vendorId\": 2,\n" +
                                        "    \"name\": \"Vesta\",\n" +
                                        "    \"price\": 900,\n" +
                                        "    \"power\": 106,\n" +
                                        "    \"bodyType\": \"wagon\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"green\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 7,\n" +
                                        "    \"vendorId\": 2,\n" +
                                        "    \"name\": \"Xray\",\n" +
                                        "    \"price\": 950,\n" +
                                        "    \"power\": 106,\n" +
                                        "    \"bodyType\": \"hatcback\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"blue\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 8,\n" +
                                        "    \"vendorId\": 2,\n" +
                                        "    \"name\": \"4x4\",\n" +
                                        "    \"price\": 650,\n" +
                                        "    \"power\": 85,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"purple\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 9,\n" +
                                        "    \"vendorId\": 3,\n" +
                                        "    \"name\": \"Logan\",\n" +
                                        "    \"price\": 750,\n" +
                                        "    \"power\": 82,\n" +
                                        "    \"bodyType\": \"sedan\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"white\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 10,\n" +
                                        "    \"vendorId\": 3,\n" +
                                        "    \"name\": \"Sandero\",\n" +
                                        "    \"price\": 850,\n" +
                                        "    \"power\": 106,\n" +
                                        "    \"bodyType\": \"hatcback\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"blue\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 11,\n" +
                                        "    \"vendorId\": 3,\n" +
                                        "    \"name\": \"Duster\",\n" +
                                        "    \"price\": 1150,\n" +
                                        "    \"power\": 114,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"manual\",\n" +
                                        "    \"color\": \"purple\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 12,\n" +
                                        "    \"vendorId\": 3,\n" +
                                        "    \"name\": \"Arkana\",\n" +
                                        "    \"price\": 1350,\n" +
                                        "    \"power\": 114,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"black\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 13,\n" +
                                        "    \"vendorId\": 3,\n" +
                                        "    \"name\": \"Logan\",\n" +
                                        "    \"price\": 730,\n" +
                                        "    \"power\": 114,\n" +
                                        "    \"bodyType\": \"sedan\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"black\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 14,\n" +
                                        "    \"vendorId\": 4,\n" +
                                        "    \"name\": \"Corolla\",\n" +
                                        "    \"price\": 980,\n" +
                                        "    \"power\": 104,\n" +
                                        "    \"bodyType\": \"sedan\",\n" +
                                        "    \"equip\": \"comfort\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"black\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 15,\n" +
                                        "    \"vendorId\": 4,\n" +
                                        "    \"name\": \"Rav4\",\n" +
                                        "    \"price\": 1730,\n" +
                                        "    \"power\": 114,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"standard\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"blue\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 16,\n" +
                                        "    \"vendorId\": 4,\n" +
                                        "    \"name\": \"Fortuner\",\n" +
                                        "    \"price\": 3730,\n" +
                                        "    \"power\": 249,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"premium\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"blue\"\n" +
                                        "  },\n" +
                                        "  {\n" +
                                        "    \"id\": 17,\n" +
                                        "    \"vendorId\": 4,\n" +
                                        "    \"name\": \"Land Cruiser\",\n" +
                                        "    \"price\": 4870,\n" +
                                        "    \"power\": 249,\n" +
                                        "    \"bodyType\": \"suv\",\n" +
                                        "    \"equip\": \"premium\",\n" +
                                        "    \"gearbox\": \"automatic\",\n" +
                                        "    \"color\": \"red\"\n" +
                                        "  }\n" +
                                        "]")
                );
        mockMvc.perform(get("/cars/5"))
                .andExpect(
                        content()
                                .json(
                                        "  {\n" +
                                                "    \"id\": 5,\n" +
                                                "    \"vendorId\": 2,\n" +
                                                "    \"name\": \"Granta\",\n" +
                                                "    \"price\": 600,\n" +
                                                "    \"power\": 87,\n" +
                                                "    \"bodyType\": \"hatcback\",\n" +
                                                "    \"equip\": \"standard\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"green\"\n" +
                                                "  }")
                );

        mockMvc.perform(get("/cars/by-vendor/4"))
                .andExpect(
                        content()
                                .json(
                                        "  [\n" +
                                                "    {\n" +
                                                "      \"id\": 14,\n" +
                                                "      \"vendorId\": 4,\n" +
                                                "      \"name\": \"Corolla\",\n" +
                                                "      \"price\": 980,\n" +
                                                "      \"power\": 104,\n" +
                                                "      \"bodyType\": \"sedan\",\n" +
                                                "      \"equip\": \"comfort\",\n" +
                                                "      \"gearbox\": \"automatic\",\n" +
                                                "      \"color\": \"black\"\n" +
                                                "    },\n" +
                                                "    {\n" +
                                                "      \"id\": 15,\n" +
                                                "      \"vendorId\": 4,\n" +
                                                "      \"name\": \"Rav4\",\n" +
                                                "      \"price\": 1730,\n" +
                                                "      \"power\": 114,\n" +
                                                "      \"bodyType\": \"suv\",\n" +
                                                "      \"equip\": \"standard\",\n" +
                                                "      \"gearbox\": \"automatic\",\n" +
                                                "      \"color\": \"blue\"\n" +
                                                "    },\n" +
                                                "    {\n" +
                                                "      \"id\": 16,\n" +
                                                "      \"vendorId\": 4,\n" +
                                                "      \"name\": \"Fortuner\",\n" +
                                                "      \"price\": 3730,\n" +
                                                "      \"power\": 249,\n" +
                                                "      \"bodyType\": \"suv\",\n" +
                                                "      \"equip\": \"premium\",\n" +
                                                "      \"gearbox\": \"automatic\",\n" +
                                                "      \"color\": \"blue\"\n" +
                                                "    },\n" +
                                                "    {\n" +
                                                "      \"id\": 17,\n" +
                                                "      \"vendorId\": 4,\n" +
                                                "      \"name\": \"Land Cruiser\",\n" +
                                                "      \"price\": 4870,\n" +
                                                "      \"power\": 249,\n" +
                                                "      \"bodyType\": \"suv\",\n" +
                                                "      \"equip\": \"premium\",\n" +
                                                "      \"gearbox\": \"automatic\",\n" +
                                                "      \"color\": \"red\"\n" +
                                                "    }\n" +
                                                "  ]")
                );

        mockMvc.perform(get("/cars/by-bodyType/suv"))
                .andExpect(
                        content()
                                .json(
                                        "[\n" +
                                                "  {\n" +
                                                "    \"id\": 8,\n" +
                                                "    \"vendorId\": 2,\n" +
                                                "    \"name\": \"4x4\",\n" +
                                                "    \"price\": 650,\n" +
                                                "    \"power\": 85,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"comfort\",\n" +
                                                "    \"gearbox\": \"manual\",\n" +
                                                "    \"color\": \"purple\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 11,\n" +
                                                "    \"vendorId\": 3,\n" +
                                                "    \"name\": \"Duster\",\n" +
                                                "    \"price\": 1150,\n" +
                                                "    \"power\": 114,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"comfort\",\n" +
                                                "    \"gearbox\": \"manual\",\n" +
                                                "    \"color\": \"purple\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 12,\n" +
                                                "    \"vendorId\": 3,\n" +
                                                "    \"name\": \"Arkana\",\n" +
                                                "    \"price\": 1350,\n" +
                                                "    \"power\": 114,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"comfort\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"black\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 15,\n" +
                                                "    \"vendorId\": 4,\n" +
                                                "    \"name\": \"Rav4\",\n" +
                                                "    \"price\": 1730,\n" +
                                                "    \"power\": 114,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"standard\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"blue\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 16,\n" +
                                                "    \"vendorId\": 4,\n" +
                                                "    \"name\": \"Fortuner\",\n" +
                                                "    \"price\": 3730,\n" +
                                                "    \"power\": 249,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"premium\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"blue\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 17,\n" +
                                                "    \"vendorId\": 4,\n" +
                                                "    \"name\": \"Land Cruiser\",\n" +
                                                "    \"price\": 4870,\n" +
                                                "    \"power\": 249,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"premium\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"red\"\n" +
                                                "  }\n" +
                                                "]")
                );

        mockMvc.perform(get("/cars/by-color/white"))
                .andExpect(
                        content()
                                .json(
                                        "[\n" +
                                                "  {\n" +
                                                "    \"id\": 1,\n" +
                                                "    \"vendorId\": 1,\n" +
                                                "    \"name\": \"Rio\",\n" +
                                                "    \"price\": 800,\n" +
                                                "    \"power\": 99,\n" +
                                                "    \"bodyType\": \"sedan\",\n" +
                                                "    \"equip\": \"standard\",\n" +
                                                "    \"gearbox\": \"manual\",\n" +
                                                "    \"color\": \"white\"\n" +
                                                "  },\n" +
                                                "  {\n" +
                                                "    \"id\": 9,\n" +
                                                "    \"vendorId\": 3,\n" +
                                                "    \"name\": \"Logan\",\n" +
                                                "    \"price\": 750,\n" +
                                                "    \"power\": 82,\n" +
                                                "    \"bodyType\": \"sedan\",\n" +
                                                "    \"equip\": \"comfort\",\n" +
                                                "    \"gearbox\": \"manual\",\n" +
                                                "    \"color\": \"white\"\n" +
                                                "  }\n" +
                                                "]")
                );

        mockMvc.perform(
                get("/cars/search")
                        .queryParam("color", "red")
                        .queryParam("gearbox", "automatic")
        )
                .andExpect(
                        content()
                                .json(
                                        "[\n" +
                                                "  {\n" +
                                                "    \"id\": 17,\n" +
                                                "    \"vendorId\": 4,\n" +
                                                "    \"name\": \"Land Cruiser\",\n" +
                                                "    \"price\": 4870,\n" +
                                                "    \"power\": 249,\n" +
                                                "    \"bodyType\": \"suv\",\n" +
                                                "    \"equip\": \"premium\",\n" +
                                                "    \"gearbox\": \"automatic\",\n" +
                                                "    \"color\": \"red\"" +
                                                "\n" +
                                                "  }\n" +
                                                "]")
                );

        mockMvc.perform(
                post("/cars")
                        .contentType("application/json")
                        .content("{\n" +
                                "  \"id\": 0,\n" +
                                "  \"vendorId\": 4,\n" +
                                "  \"name\": \"Prius\",\n" +
                                "  \"price\": 1940,\n" +
                                "  \"power\": 150,\n" +
                                "  \"bodyType\": \"hatchback\",\n" +
                                "  \"equip\": \"comfort\",\n" +
                                "  \"gearbox\": \"automatic\",\n" +
                                "  \"color\": \"gray\"\n" +
                                "}")
        )
                .andExpect(
                        content()
                                .json(
                                        "{\n" +
                                                "  \"id\": 18,\n" +
                                                "  \"vendorId\": 4,\n" +
                                                "  \"name\": \"Prius\",\n" +
                                                "  \"price\": 1940,\n" +
                                                "  \"power\": 150,\n" +
                                                "  \"bodyType\": \"hatchback\",\n" +
                                                "  \"equip\": \"comfort\",\n" +
                                                "  \"gearbox\": \"automatic\",\n" +
                                                "  \"color\": \"gray\"\n" +
                                                "}")
                );
    }
}