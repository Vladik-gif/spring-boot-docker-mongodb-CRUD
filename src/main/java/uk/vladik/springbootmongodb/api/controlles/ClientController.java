package uk.vladik.springbootmongodb.api.controlles;

import org.springframework.web.bind.annotation.*;
import uk.vladik.springbootmongodb.api.service.ClientService;
import uk.vladik.springbootmongodb.store.entity.ClientEntity;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    private static final String CREATE_CLIENT = "/create";
    private static final String GET_ALL_CLIENT = "/getAll";
    private static final String UPDATE_CLIENT = "/update/{id}";
    private static final String DELETE_CLIENT = "/delete/{id}";

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping(GET_ALL_CLIENT)
    public List<ClientEntity> getAll(){
        return clientService.getAll();
    }

    @PostMapping(CREATE_CLIENT)
    public ClientEntity create(@RequestBody ClientEntity client){
        return clientService.create(client);
    }

    @PutMapping(UPDATE_CLIENT)
    public ClientEntity update(@PathVariable String id, @RequestBody ClientEntity client){
        return clientService.update(id, client);
    }

    @DeleteMapping(DELETE_CLIENT)
    public void delete_id(@PathVariable String id){
        clientService.deleteId(id);
    }

}
