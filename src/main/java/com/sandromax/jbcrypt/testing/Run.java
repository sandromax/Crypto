package com.sandromax.jbcrypt.testing;

public class Run {
    public static void main(String[] args) {

        String pass = "qwerty123";
        String passHash = BCrypt.hashpw(pass, BCrypt.gensalt(12));
        System.out.println(passHash);

        boolean matched = BCrypt.checkpw(pass, passHash);
        System.out.println(matched);
    }
}
