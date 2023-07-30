package com.jingchu.flow.pojo;

import com.jingchu.flow.pojo.cons.CodeDefConst;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 21:21
 */
@Data
public class Inst implements Cloneable{

    private String businessType;

    private Dna dna;

    private String dnaCode;

    private String dnaName;

    private String instType = CodeDefConst.INST_TYPE_DEFAULT;

    private int total = -1;

    private Cell parentCell;

    private List<Cell> cells = new ArrayList<>();

    @Override
    public Inst clone() {
        try {
            return (Inst) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
