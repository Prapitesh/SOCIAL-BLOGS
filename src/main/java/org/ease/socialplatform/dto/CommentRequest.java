package org.ease.socialplatform.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@NotBlank
@Email
@Size(min = 8)
@Data
public class CommentRequest {

    @NotBlank(message = "Comment cannot be empty")
    private String content;

    private Long parentCommentId;
}
