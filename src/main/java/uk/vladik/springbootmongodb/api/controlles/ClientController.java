package uk.vladik.springbootmongodb.api.controlles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uk.vladik.springbootmongodb.store.entity.ClientEntity;
import uk.vladik.springbootmongodb.store.repository.ClientRepository;

@RestController
public class ClientController {

    private final ClientRepository clientRepository;

    private static final String CREATE_CLIENT = "/create";

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @PostMapping(CREATE_CLIENT)
    public ClientEntity create(@RequestBody ClientEntity client){
        return clientRepository.save(client);
    }
}
