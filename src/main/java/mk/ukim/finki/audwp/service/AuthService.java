package mk.ukim.finki.audwp.service;

import mk.ukim.finki.audwp.model.User;

public interface AuthService {
    User login(String username, String password);
}

