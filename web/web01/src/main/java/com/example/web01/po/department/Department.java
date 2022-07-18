package com.example.web01.po.department;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class Department {
    private String dep_id;
    private String dep_name;
    private String dep_manager;
    private String dep_phone;
    private String dep_description;
    private Date dep_date;
}
