package com.kiprono.springsec.models;

import java.io.Serializable;

/**
 * @author Vkiprono on 5/7/20 ---4:08 PM
 * @project springsec
 */
public class AuthenticationResponse implements Serializable {

    private final String jwt;



    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
