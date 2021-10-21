package mate.service;

import mate.model.Driver;

import javax.naming.AuthenticationException;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
