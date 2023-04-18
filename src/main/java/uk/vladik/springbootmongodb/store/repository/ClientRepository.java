package uk.vladik.springbootmongodb.store.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import uk.vladik.springbootmongodb.store.entity.ClientEntity;

@Repository
public interface ClientRepository extends MongoRepository<ClientEntity, String> {


}
