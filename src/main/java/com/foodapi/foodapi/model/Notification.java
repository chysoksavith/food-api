package com.foodapi.foodapi.model;

import com.foodapi.foodapi.enums.NotificationChannel;
import com.foodapi.foodapi.enums.NotificationType;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "notification")
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Notification extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private NotificationType notificationType;

    @Enumerated(EnumType.STRING)
    private NotificationChannel notificationChannel;


    @Column(nullable = true)
    private Long userId;

    @Column(nullable = true)
    private Long deviceId;
    private boolean readss;

}
