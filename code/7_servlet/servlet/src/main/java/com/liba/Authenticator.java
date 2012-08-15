package com.liba;

import java.util.HashMap;
import java.util.Map;

public class Authenticator {
    private Map<String, String> userDB;

    public Authenticator() {
        this.userDB = new HashMap<String, String>();
        this.userDB.put("sulong", "123456");
        this.userDB.put("wangyi", "654321");
    }

    public boolean checkPassword(String user, String password) {
        return this.userDB.get(user) != null && this.userDB.get(user).equals(password);
    }
}
