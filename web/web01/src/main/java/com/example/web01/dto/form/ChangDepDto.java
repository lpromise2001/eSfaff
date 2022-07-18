package com.example.web01.dto.form;

import com.example.web01.po.form.ChangDep;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChangDepDto extends ChangDep {

    private String dep_chang_date_start;
    private String dep_chang_date_end;

}
