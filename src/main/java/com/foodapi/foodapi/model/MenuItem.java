package com.foodapi.foodapi.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "menuItem")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String description;
    private double price;
    private Integer availability;

    @ManyToOne(fetch = FetchType.LAZY)
    private Restaurant restaurant;

}
