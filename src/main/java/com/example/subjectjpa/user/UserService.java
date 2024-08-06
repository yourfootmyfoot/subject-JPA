package com.example.subjectjpa.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void save(UserSaveRequestDto dto) {
        User user = new User(
                dto.getUserName(),
                dto.getEnrollDate(),
                dto.getUserRole()
        );

        userRepository.save(user);
    }

}
