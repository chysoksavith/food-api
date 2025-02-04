package com.foodapi.foodapi.model;

import com.foodapi.foodapi.enums.DeliveryStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "delivery")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Delivery  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIME)
    private Date pickUpTime = new Date();

    @Temporal(TemporalType.TIME)
    private Date deliveryTime = new Date();

    private String pickupAddress;
    private String deliveryAddress;
    private double deliveryFee;
    private DeliveryStatus deliveryStatus;
    private Long deliveryPartnerId;
    private Long orderId;
}
