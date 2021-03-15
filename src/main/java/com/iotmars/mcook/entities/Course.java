package com.iotmars.mcook.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: CJ
 * @Data: 2021/3/15 17:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    private Long cid;
    private String cname;
    private Long userId;
    private String cstatus;

}
