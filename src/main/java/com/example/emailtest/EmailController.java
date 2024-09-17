package com.example.emailtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class EmailController {

    private final EmailUtil emailUtil;

    @GetMapping("/sendmail")
    public String sendMail() {
        emailUtil.sendEmail("compilemate@gmail.com", "[Tistory 인증메일]", "되는지 테스트 하는 거예요");
        return "메일 잘 보내졌어";
    }
}
