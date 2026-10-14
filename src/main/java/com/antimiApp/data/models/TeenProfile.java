package com.antimiApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "teen_profiles")
public class TeenProfile {

    @Id
    private String id;

    private String userId;
    private Date dateOfBirth;
    private String guardianId;
    private Date createdAt = new Date();
}
