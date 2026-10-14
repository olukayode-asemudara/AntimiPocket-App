package com.antimiApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "guardian_profiles")
public class GuardianProfile {

    @Id
    private String id;

    private String userId;
    private String phoneNumber;
    private Date createdAt = new Date();
}

