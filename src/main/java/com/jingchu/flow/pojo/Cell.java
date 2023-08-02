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

    protected long id;

    protected long rootId;

    protected long parentId;

    protected String operationFlag;

    protected String dnaCode;

    protected Map<String,Va> vas = new HashMap<>();

    protected Map<String,Inst> children = new HashMap<>();

    protected Inst owner;
}
