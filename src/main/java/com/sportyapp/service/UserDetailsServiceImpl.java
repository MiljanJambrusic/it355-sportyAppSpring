package com.sportyapp.service;


import com.sportyapp.model.Korisnici;
import com.sportyapp.model.UserAuth;
import com.sportyapp.repository.korisniciRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    korisniciRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Korisnici user = userRepository.findBykorisnickoime(username).orElseThrow(
                () -> new UsernameNotFoundException("User Not Found with this username : " + username));
        return UserAuth.build(user);
    }
}