package com.antimiApp.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "notifications")
public class Notification {

    @Id
    private String id;

    private String userId;
    private String message;
    private Boolean isRead = false;
    private Date createdAt = new Date();
}
