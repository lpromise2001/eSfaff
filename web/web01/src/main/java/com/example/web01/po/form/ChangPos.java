package com.example.web01.po.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChangPos {

    private Integer num;
    private String dep_name;
    private String old_p_name;
    private String new_p_name;
    private String staff_name;
    private String staff_sex;
    private String p_chang_date;
    private String p_chang_reason;

}
