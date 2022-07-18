package com.example.web01.po.form;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LeaveStaff {

    private Integer num;
    private String dep_name;
    private String p_name;
    private String staff_name;
    private String staff_sex;
    private String leave_date;
    private String leave_reason;

}
