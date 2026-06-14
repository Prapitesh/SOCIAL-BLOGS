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
public class PostResponse {

    private Long id;

    private String title;

    private String content;

    private String coverImage;

    private String author;

    private String category;

    private Long likes;

    private Long comments;

    private Integer views;

    private LocalDateTime createdAt;
}
