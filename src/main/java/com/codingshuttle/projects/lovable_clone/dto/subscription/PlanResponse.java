package com.codingshuttle.projects.lovable_clone.dto.subscription;

public record PlanResponse(    Long id,
        String name,
        Integer maxProject,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAi,
        String price) {
}
