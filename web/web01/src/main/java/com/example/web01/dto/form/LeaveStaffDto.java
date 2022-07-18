package com.example.web01.dto.form;

import com.example.web01.po.form.LeaveStaff;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LeaveStaffDto extends LeaveStaff {

    private String leave_date_start;
    private String leave_date_end;

}
