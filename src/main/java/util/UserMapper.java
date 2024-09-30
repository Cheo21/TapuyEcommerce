package util;

import DTO.ClientRegistrationDTO;
import Entity.Client;

public class UserMapper {

    public static Client clientRegistrationDTOToEntity(ClientRegistrationDTO clientRegistrationDTO){
        if (clientRegistrationDTO == null) {
        }

        Client client = new Client();
        client.setFirstName(clientRegistrationDTO.getFirstName());
        client.setLastName(clientRegistrationDTO.getLastName());
        client.setEmail(clientRegistrationDTO.getEmail());
        client.setPassword(clientRegistrationDTO.getPassword());

        return client;
    }

}
