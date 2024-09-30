package Controller;

import DTO.LoginDTO;
import Entity.Client;
import Entity.User;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserService<User> userService;


    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        try {
            Optional<User> user = userService.findUserByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());
            if (user.isPresent()) {
                // Aquí puedes generar un token o una sesión, según tu lógica
                return ResponseEntity.ok("Login successful");
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error logging in: " + e.getMessage());
        }
    }

}
