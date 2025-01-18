package org.MrDigital.order_config.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String reference;
    private Long product;
    private int quantite;
    private String description;
    private double montant;
    private Date date_creation;
}
