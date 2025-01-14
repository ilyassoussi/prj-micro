package org.MrDigital.customer_config.model;

import lombok.*;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or any other strategy
    private Long id;

    private String name;
    private String phone;
    private String mail;
    private String password;
    // Additional fields can be added here
}
