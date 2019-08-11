package com.sportyapp.controller;

import com.sportyapp.model.Korisnici;
import com.sportyapp.model.Role;
import com.sportyapp.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sportyapp.repository.korisniciRepository;


import javax.validation.Valid;
import java.security.SecureRandom;
import java.util.InvalidPropertiesFormatException;
import java.util.UUID;

@RestController
@CrossOrigin
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    korisniciRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody Korisnici user) {
        System.out.println(user);
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getKorisnickoime(), user.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = UUID.randomUUID().toString().toUpperCase();
        Korisnici korisnik = userRepository.findBykorisnickoime(user.getKorisnickoime()).orElseThrow(() -> new UsernameNotFoundException("User Not Found with this username : " + user.getKorisnickoime()));
        userRepository.setToken(korisnik.getK_id(),token);

        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody Korisnici user) {
        System.out.println(user);
        if (userRepository.existsByKorisnickoime(user.getKorisnickoime())) {
            return new ResponseEntity<>("Korisnik sa ovim usernameom vec postoji", HttpStatus.BAD_REQUEST);
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            return new ResponseEntity<>("Korisnik sa ovim emailom vec postoji", HttpStatus.BAD_REQUEST);
        }

        Role role = roleRepository.findByRole("NORMAL");
        user.getRoles().add(role);
        user.setPassword(encoder.encode(user.getPassword()));

        userRepository.save(user);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
