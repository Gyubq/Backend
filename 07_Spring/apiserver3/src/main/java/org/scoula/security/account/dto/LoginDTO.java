package org.scoula.security.account.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;

import javax.servlet.http.HttpServletRequest;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoginDTO {
    private String username;
    private String password;

    public static LoginDTO of(HttpServletRequest request) {
        // AuthenticationException을 더 이상 던지지 않음
        ObjectMapper om = new ObjectMapper();
        try {
            return om.readValue(request.getInputStream(), LoginDTO.class);
        } catch (Exception e) {
            e.printStackTrace();
            // 기존과 동일하게 Exception을 catch하여 BadCredentialsException을 던짐
            throw new BadCredentialsException("username 또는 password가 없습니다.", e);
            // 수정된 부분: BadCredentialsException을 던질 때 원래 발생한 예외 e를 추가로 전달
        }
    }
}
