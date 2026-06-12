package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Plan {
    Long id;
    String name;
    String stripe_price_id;
    Integer max_project;
    Integer maxTokensPerDay;
    Boolean unlimitedAt;
    Boolean active;
}
