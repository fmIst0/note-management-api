package com.example.backend.dto;

import lombok.Data;

@Data
public class NoteDto {
    private Long id;
    private String title;
    private String content;
}
