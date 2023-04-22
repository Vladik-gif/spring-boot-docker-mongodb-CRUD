package uk.vladik.springbootmongodb.api.service;

import org.springframework.stereotype.Service;
import uk.vladik.springbootmongodb.store.entity.ClientEntity;
import uk.vladik.springbootmongodb.store.repository.ClientRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<ClientEntity> getAll(){
        return clientRepository.findAll();
    }

    public ClientEntity create(ClientEntity client) {
        return clientRepository.save(client);
    }

    public ClientEntity update(String id, ClientEntity client) {
        ClientEntity clientId = clientRepository.findById(id).orElse(null);

        assert clientId != null;
        clientId.setUsername(client.getUsername());
        clientId.setAge(client.getAge());
        clientId.setCarModel(client.getCarModel());

        return clientRepository.save(clientId);
    }

    public void deleteId(String id) {
        clientRepository.deleteById(id);
    }
}
