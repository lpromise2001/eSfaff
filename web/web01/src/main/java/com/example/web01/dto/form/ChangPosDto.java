package com.example.web01.dto.form;

import com.example.web01.po.form.ChangPos;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ChangPosDto extends ChangPos {

    private String p_chang_date_start;
    private String p_chang_date_end;

}
