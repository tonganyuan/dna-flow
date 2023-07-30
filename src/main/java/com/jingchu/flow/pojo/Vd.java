package com.jingchu.flow.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 属性属性描述信息
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 9:44
 */
@Data
public class Vd {

    private String vdCode; //属性编码

    private String vdName; //属性 名称

    private String vdDescription;//属性描述

    private int serNo;//序号 用户排序

    private String dataType;//数据类型

    private String mdCode; //主数据代码

    private String vdControl;

    private Date lastTime; //最后更新时间

//    private VdExtension extension = null;

}
