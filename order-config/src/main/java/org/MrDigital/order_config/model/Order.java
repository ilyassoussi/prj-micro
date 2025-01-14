package org.MrDigital.order_config.model;

import jakarta.persistence.*;
import lombok.*;
import org.MrDigital.invontery_config.model.Product;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Order_table")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private Long product;
    private int quantite;
    private String description;
    private double montant;
    private Date date_creation;
}
