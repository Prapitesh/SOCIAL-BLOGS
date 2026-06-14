package org.ease.socialplatform.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@NotBlank
@Email
@Size(min = 8)
@Data
@Builder
public class CreatePostRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String content;

    private String coverImage;

    @NotNull
    private Long categoryId;
}
