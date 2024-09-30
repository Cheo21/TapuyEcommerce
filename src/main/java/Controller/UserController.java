package Controller;


import DTO.ClientRegistrationDTO;
import Entity.Client;
import Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.UserMapper;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;



    @PostMapping
    public ResponseEntity<String> registerClient(@Valid @RequestBody ClientRegistrationDTO userRegistrationDTO) {
        try {
           Client client = UserMapper.clientRegistrationDTOToEntity(userRegistrationDTO);
           userService.createUser(client);
           return ResponseEntity.ok("Client registered successfully");
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error registering user: " + e.getMessage());
        }
    }





}
