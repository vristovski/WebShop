package mk.ukim.finki.audwp.service;

import mk.ukim.finki.audwp.model.Role;
import mk.ukim.finki.audwp.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User register(String username, String password, String repeatPassword, String name, String surname, Role role);
}

