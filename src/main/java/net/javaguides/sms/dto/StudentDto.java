package net.javaguides.sms.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

        private Long id;

        @NotEmpty(message = "first name can not be empty")
        private String firstName;

        @NotEmpty(message = "last name can not be empty")
        private String lastName;

        @NotEmpty(message = "Email can not be empty")
        @Email
        private String email;
}