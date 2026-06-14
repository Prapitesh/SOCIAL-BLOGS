package org.ease.socialplatform.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@NotBlank
@Email
@Size(min = 8)
@Data
@Builder
public class NotificationResponse {

    private Long id;

    private String message;

    private boolean read;

    private LocalDateTime createdAt;
}
