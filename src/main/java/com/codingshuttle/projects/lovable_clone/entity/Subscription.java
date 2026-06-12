package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.SubscriptionEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Subscription {
    Long id;
    User user;
    Plan plan;
    String stripeCustomerId;
    String stripeSubscriptionId;
    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Boolean cancelAtPeriodEnd = false;
    SubscriptionEnum subscription;
    Instant cratedAt;
    Instant updatedAt;
}
