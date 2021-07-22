package com.example.clasespringtransaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionExamplesController {

    private final AddClientesService addClientesService;

    public TransactionExamplesController(AddClientesService addClientesService) {
        this.addClientesService = addClientesService;
    }

    @GetMapping("/add-cliente")
    public String AddCliente() {
        return addClientesService.addCliente();
    }

}
