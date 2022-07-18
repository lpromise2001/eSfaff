package com.example.web01.dto.form;

import com.example.web01.po.form.NewStaff;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewStaffDto extends NewStaff {
    private String entry_date_start;
    private String entry_date_end;
}
