package com.ablaze.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@Setter
@ToString
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Double money;
}
