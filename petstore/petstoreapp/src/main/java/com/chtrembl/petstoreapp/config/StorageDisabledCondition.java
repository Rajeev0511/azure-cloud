package com.chtrembl.petstoreapp.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class StorageDisabledCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String storageEnabled = context.getEnvironment().getProperty("storage.enabled");
        return storageEnabled == null || storageEnabled.equalsIgnoreCase("false");
    }
}
