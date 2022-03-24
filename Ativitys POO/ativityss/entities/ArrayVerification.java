package entities;

public class ArrayVerification{
    private Integer lineValue;
    private Integer columValue;

    public ArrayVerification(Integer lineValue, Integer columValue){
        this.lineValue = lineValue;
        this.columValue = columValue;
    }

    public Integer getLineValue(){
        return lineValue;
    }

    public void setLineValue(Integer lineValue){
        this.lineValue = lineValue;
    }

    public Integer getColumValue(){
        return columValue;
    }

    public void setColumValue(Integer columValue){
        this.columValue = columValue;
    }
}