package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수입력")
    private String name;

    @NotEmpty(message = "이메일은 필수입력")
    @Email(message = "이메일 형식으로 입력해야 합니다")
    private String email;

    @NotEmpty(message = "비밀번호는 필수입력")
    @Length(min = 8, max = 16, message = "비밀번호는 8자 이상, 16자 이하로 입력해야 합니다")
    private String password;

    @NotEmpty(message = "주소는 필수입력")
    private String address;
}
