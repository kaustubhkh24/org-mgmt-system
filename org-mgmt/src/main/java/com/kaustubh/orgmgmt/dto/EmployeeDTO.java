package com.kaustubh.orgmgmt.dto;

import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid mobile number")
    private String mobile;

    @NotNull(message = "Date of birth is required")
    @Past(message = "DOB must be in the past")
    private LocalDate dob;

    @NotNull(message = "Role ID is required")
    private Long roleId;

    @NotNull(message = "Department ID is required")
    private Long departmentId;
}
