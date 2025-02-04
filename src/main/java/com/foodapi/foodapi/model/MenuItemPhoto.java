package com.foodapi.foodapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menu_item_photo")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemPhoto extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileType;
    private String fileFormat;
    private double fileSize;
    private String fileName;
    private String smallUrl;
    private String mediumUrl;
    private String largeUrl;
    private String uploadBy;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    private MenuItem menuItem;

}
