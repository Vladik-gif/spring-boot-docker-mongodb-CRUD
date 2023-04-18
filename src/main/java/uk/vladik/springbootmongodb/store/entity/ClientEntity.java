package uk.vladik.springbootmongodb.store.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClientEntity {

    @Id
    private String id;
    private String username;

    public ClientEntity() {}
}
