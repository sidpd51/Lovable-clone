package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Setter
@Getter
@AllArgsConstructor
public class ProjectFile {
    Long id;
    Project project;
    String path;
    String minioObjectKey;
    Instant createdAt;
    Instant updatedAt;
    User createdBy;
    User updatedBy;
}
