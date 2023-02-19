package mk.ukim.finki.audwp.service.impl;

import mk.ukim.finki.audwp.model.User;
import mk.ukim.finki.audwp.model.exceptions.InvalidArgumentException;
import mk.ukim.finki.audwp.model.exceptions.InvalidUserCreditialsException;
import mk.ukim.finki.audwp.model.exceptions.PasswordsDoNotMatchException;
import mk.ukim.finki.audwp.model.exceptions.UsernameAlreadyExistsException;
import mk.ukim.finki.audwp.repository.jpa.UserRepository;
import mk.ukim.finki.audwp.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String username, String password) {
        if (username==null || username.isEmpty() || password==null || password.isEmpty()) {
            throw new InvalidArgumentException();
        }
        return userRepository.findByUsernameAndPassword(username,
                password).orElseThrow(InvalidUserCreditialsException::new);
    }
}


