package com.jingchu.flow.pojo.util;

import com.jingchu.flow.pojo.*;
import com.jingchu.flow.pojo.cons.CodeDefConst;
import com.jingchu.flow.pojo.cons.DataType;
import com.jingchu.flow.pojo.cons.OperationFlag;

/**
 * @author: tonganyuan
 * @Description:
 * @Date: 2023/7/30 22:26
 */
public class DnaTool {

    public static Cell singleDna2Cell(String instType, Dna dna){
        if(dna == null){
            return null;
        }
        Cell cell = null;

        if(instType.equals(CodeDefConst.INST_TYPE_DEFAULT)){
            cell = new Cell();
        }
        if(instType.equals(CodeDefConst.INST_TYPE_FILTER_RESULT)){
            cell = new FilterResultCell(dna.getDnaCode());
            cell.setOperationFlag(OperationFlag.OPERATION_FLAG_NEW);
        }
        for (Vd vd : dna.getVds()) {
            Va va = vd2Va(vd);
            cell.getVas().put(vd.getVdName(),va);
        }
        return cell;
    }

    private static Va vd2Va(Vd vd) {
        if(vd == null){
            throw new RuntimeException("属性vd不能为空");
        }
        Va va = new Va();
        va.setCode(vd.getVdCode());
        va.setName(vd.getVdName());
        String dataType = vd.getDataType();
        va.setDataType(vd.getDataType());
        if(DataType.DATA_TYPE_INTEGER.equals(dataType)){
            va.setValue(0);
        }
        if(DataType.DATA_TYPE_LONG.equals(dataType)){
            va.setValue(0L);
        }
        if(DataType.DATA_TYPE_FLOAT.equals(dataType)){
            va.setValue(0.0);
        }
        return va;
    }
}
