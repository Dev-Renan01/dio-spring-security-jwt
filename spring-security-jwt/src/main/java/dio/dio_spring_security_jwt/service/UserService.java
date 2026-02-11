package dio.dio_spring_security_jwt.service;

import dio.dio_spring_security_jwt.model.User;
import dio.dio_spring_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    // Interface do Spring Security responsável por criptografar e validar senhas de forma segura.
    // Evita que senhas sejam armazenadas em texto puro no banco de dados.
    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String pass = user.getPassword();
        user.setPassword(encoder.encode(pass));//criptografando antes de entrar no banco

        repository.save(user);
    }
}
