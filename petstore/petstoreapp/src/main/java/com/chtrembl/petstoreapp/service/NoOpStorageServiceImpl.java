package com.chtrembl.petstoreapp.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import com.chtrembl.petstoreapp.config.StorageDisabledCondition;

@Component
@Conditional(StorageDisabledCondition.class)
public class NoOpStorageServiceImpl implements StorageService {

    @Override
    public String uploadFile(MultipartFile file) {
        // No-op implementation
        return "No-Op: File upload is disabled in local profile.";
    }

    // other methods if needed
}
