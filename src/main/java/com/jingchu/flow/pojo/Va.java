package com.jingchu.flow.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 21:52
 */
@Data
public class Va implements Serializable {

    private long id;

    private String code;

    private String name;

    private String dataType;

    private Object value;
}
