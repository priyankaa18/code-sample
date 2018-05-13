package com.charter.enterprise.motd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
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
	
	String message = "Welcome to Charter.  All systems are nominal.";
	
    @Autowired
    private MockMvc mvc;

    @Test
    public void getMotd() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/message"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(message)));
    }
    
    /**
     * updating the motd by setting new Message
     *
     * @throws Exception
     */
    @Test
    public void setMotd() throws Exception {
        String newMessage = "This is the new message.";
        mvc.perform(MockMvcRequestBuilders.put("/message").content(newMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("New Message is set")));

        mvc.perform(MockMvcRequestBuilders.get("/message"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(newMessage)));
         
    }
    
    /**
     * updating the motd multiple times to see it is retrieving the latest.
     *
     * @throws Exception
     */
    @Test
    public void setMotdMultiple() throws Exception {
        String newMessage = "This is the new message.";
        mvc.perform(MockMvcRequestBuilders.put("/message").content(newMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("New Message is set")));

        mvc.perform(MockMvcRequestBuilders.get("/message"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(newMessage)));
         newMessage = "This is the Brand new message.";
         
         mvc.perform(MockMvcRequestBuilders.put("/message").content(newMessage))
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo("New Message is set")));

         mvc.perform(MockMvcRequestBuilders.get("/message"))
         .andExpect(status().isOk())
         .andExpect(content().string(equalTo(newMessage)));
    }

    /**
     * Error Scenario 1
     * Throws an  error as we are setting empty motd 
     * Added new Message string, because we have set the multiple message in previous step, 
     * so to get the new message and test to be pass, we are adding the new string here
     * @throws Exception
     */
    @Test
    public void setEmpty() throws Exception {
    	String newMessage = "This is the Brand new message.";
        mvc.perform(MockMvcRequestBuilders.put("/message").content(""))
                .andExpect(status().isBadRequest());

        mvc.perform(MockMvcRequestBuilders.get("/message"))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(newMessage)));
    }

    /**
     * Error Scenario 2
     * Throws an error as we trying to set whitespace
     *
     * @throws Exception
     */
    @Test
    public void setWhitespace() throws Exception {
        mvc.perform(MockMvcRequestBuilders.put("/message").content("    "))
                .andExpect(status().isBadRequest());
    }
}
