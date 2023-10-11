package com.ablaze.domain;

import lombok.*;

import java.io.Serializable;
/**
 * @author Lenovo
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
