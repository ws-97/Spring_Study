package com.example.container;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author ws
 * @create 2023/3/9 11:07
 * @Description
 */
public class CustomerProperty extends PropertyEditorSupport {
    private String format="yyyy-MM-dd";

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }


    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        SimpleDateFormat sdf =new SimpleDateFormat(format);
        try {
            //转换对象，通过setValue方法重新赋值
            this.setValue(sdf.parse(text));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

