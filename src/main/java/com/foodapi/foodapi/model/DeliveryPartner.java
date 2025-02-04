package com.foodapi.foodapi.model;

import com.foodapi.foodapi.enums.VehicleType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "delivery_partner")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryPartner extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(name = "username", unique = true, nullable = false)
    private String username;
    private String password;
    private String gender;
    private Date dateOfBirth;
    @Column(name = "phone_number", unique = true, nullable = false)
    private String phoneNumber;
    private String email;
    private String address;
    private VehicleType vehicleType;
    private Boolean available;


}
