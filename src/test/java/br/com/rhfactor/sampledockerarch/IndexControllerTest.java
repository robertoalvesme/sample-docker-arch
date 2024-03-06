package br.com.rhfactor.sampledockerarch;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class IndexControllerTest {

    @Autowired
    private IndexController controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void greetingShouldReturnDefaultMessage() throws Exception {
        DefaultMessage message = restTemplate.getForObject("http://localhost:" + port + "/", DefaultMessage.class);
        assertThat(message.getMessage()).isEqualTo("Servidor Rodando com sucesso!");
    }


    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }


}