package org.MrDigital.invontery_config.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@Entity
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder

public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int price;
    private int qte;

}
