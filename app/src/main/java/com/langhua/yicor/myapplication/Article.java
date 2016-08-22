package com.langhua.yicor.myapplication;

import cn.bmob.v3.BmobObject;

/**
 * Created by yicor on 2016/8/21.
 */

public class Article extends BmobObject{
    private String title;
    private String desc;

    public Article(String name, String age) {
        this.title = name;
        this.desc = age;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public String getTitle() { return title; }
}
