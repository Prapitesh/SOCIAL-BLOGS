package org.ease.socialplatform.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@NotBlank
@Email
@Size(min = 8)
@Data
@Builder
public class CreateCategoryRequest {

    @NotBlank(message = "Category name is required")
    private String name;

    private String description;
}