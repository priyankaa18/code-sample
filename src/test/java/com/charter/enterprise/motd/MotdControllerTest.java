package com.charter.enterprise.motd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MotdControllerTest {
    @Autowired
    private MockMvc mvc;


    private final String motdEndpoint = "/motd";
    private final String expectedGetSuccessMessage = "Welcome to Charter. All systems are normal.";

    private final String putJSON = "{ \"value\": \"newTestMessage\"}";
    private final String expectedPutSuccessMessage = "Message updated successfully.";

    @Test
    public void getMotd() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get(motdEndpoint))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expectedGetSuccessMessage)));
    }

    @Test
    public void setMotd() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put(motdEndpoint)
                .contentType(MediaType.APPLICATION_JSON)
                .content(putJSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expectedPutSuccessMessage)));
    }

    @Test
    public void setMotdIncorrectMediaType() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put(motdEndpoint)
                .contentType(MediaType.TEXT_PLAIN)
                .content(putJSON))
                .andExpect(status().isUnsupportedMediaType());
    }
}
