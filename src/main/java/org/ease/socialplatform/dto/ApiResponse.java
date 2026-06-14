package org.ease.socialplatform.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@NotBlank
@Email
@Size(min = 8)
@Data
@Builder
@AllArgsConstructor
public class ApiResponse {

    private boolean success;

    private String message;
}
