package br.com.rhfactor.sampledockerarch;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public ResponseEntity<DefaultMessage> getMessage() {

        DefaultMessage message = DefaultMessage.builder()
                .message("Servidor Rodando com sucesso!")
                .build();

        return ResponseEntity
                .ok(message);

    }


}
