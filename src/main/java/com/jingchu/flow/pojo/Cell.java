package com.jingchu.flow.pojo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 21:50
 */
@Data
public class Cell {

    private long id;

    private long rootId;

    private long parentId;

    private String operationFlag;

    private String dnaCode;

    private Map<String,Va> vas = new HashMap<>();

    private Map<String,Inst> children = new HashMap<>();

    private Inst owner;
}
