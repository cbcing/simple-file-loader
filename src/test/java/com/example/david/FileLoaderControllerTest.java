package com.example.david;

import com.example.david.controller.FileLoaderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by David on 5/9/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FileLoaderControllerTest {
    @Autowired
    FileLoaderController fileLoaderController;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void testIndex() {
        assertThat(fileLoaderController).isNotNull();
    }

    @Test
    public void indexShouldReturnDefaultMessage() throws Exception {
        assertThat(this.testRestTemplate
                .getForObject("http://localhost:" + port + "/", String.class))
                .contains("<form method=\"POST\" enctype=\"multipart/form-data\" action=\"/result\">");
    }
}
