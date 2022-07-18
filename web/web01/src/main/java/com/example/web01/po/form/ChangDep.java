package com.example.web01.po.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChangDep {

    private Integer num;
    private String old_dep_name;
    private String new_dep_name;
    private String staff_name;
    private String staff_sex;
    private String dep_chang_date;
    private String dep_chang_reason;

}
