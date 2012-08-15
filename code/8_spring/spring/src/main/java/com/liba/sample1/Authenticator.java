package com.liba.sample1;

import java.util.Map;

public class Authenticator {
    private Map<String, String> u;

    public Authenticator() {

    }

    public boolean checkPassword(String username, String password) {
        return u.get(username) != null && u.get(username).equals(password);
    }

    public void setUsers(Map<String, String> users) {
        this.u = users;
    }
}
