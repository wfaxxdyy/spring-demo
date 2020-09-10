package cn.wf.springdemo.model;

import lombok.Data;

@Data
public class User implements Cloneable{
    private String name;
    private Integer age;
    /**
     *  重写clone()方法
     * @return
     */
    @Override
    public Object clone() {
        //浅拷贝
        try {
            // 直接调用父类的clone()方法
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
