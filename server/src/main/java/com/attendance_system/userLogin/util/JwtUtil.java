package com.attendance_system.userLogin.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String SECRET_KEY;

    public String generateToken(String username) {

        long nowMillis = System.currentTimeMillis();
        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date(nowMillis))
                .expiration(new Date(nowMillis + 86400000L))
                .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes()),Jwts.SIG.HS256)
                .compact();
    }

}
