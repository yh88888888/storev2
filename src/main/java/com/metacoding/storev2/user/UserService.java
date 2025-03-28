package com.metacoding.storev2.user;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public void 회원가입(UserRequest.JoinDTO joinDTO) {
        //1.DB에 동일한 username이 있는지 확인
        User user = userRepository.findByUsername(joinDTO.getUsername());
        //2. 있으면 터뜨리기
        if (user != null) throw new RuntimeException("해당 아이디가 존재합니다.");
        //3. 없으면 회원가입
        userRepository.save(joinDTO.getUsername(), joinDTO.getPassword(), joinDTO.getFullname());

    }

    public User 로그인(UserRequest.LoginDTO loginDTO) {
        User user = userRepository.findByUsername(loginDTO.getUsername());
        if(user == null)
            throw new RuntimeException("해당 아이디가 없습니다.");
        if(!(user.getPassword().equals(loginDTO.getPassword())))
            throw new RuntimeException("비밀번호가 일치하지 않습니다.");
        return user;
    }
}
