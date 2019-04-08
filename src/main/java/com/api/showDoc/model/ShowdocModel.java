package com.api.showDoc.model;

import com.api.javaParser.xdoc.model.FieldInfo;
import com.api.javaParser.xdoc.tag.ParamTagImpl;
import com.api.javaParser.xdoc.tag.RespTagImpl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * showdoc 数据
 *
 * @author huangyuyi
 * @date 2019-03-21 10:13
 */
public class ShowdocModel {

    /**
     * 简要描述|Y:22
     * 黄玉一
     */
    private String description = "";

    //接口负责人|必填
    private String author;

    /**
     * 请求URL
     */
    private List<String>  url;

    /**
     * 权限标识
     */
    private List<String> requiresPermissions;


    /**
     * 请求方式
     */
    private List<String>  methods;


    /**
     * 请求参数
     */
    private List<ParamTagImpl> paramTag;

    /**
     * 请求参数说明
     */
    private List<FieldInfo> paramFieldInfos;

    /**
     * 返回参数说明
     */
    private List<FieldInfo> fieldInfos;


    /**
     * 返回示例
     */
    private String respbody;

    /**
     * 编写时间
     */
    private String date;

    /**
     * 返回数据描述
     */
    private String respData;

    /**
     * 返回参数说明
     */
    private List<RespTagImpl> respParam;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<String>  getUrl() {
        return url;
    }

    public void setUrl(List<String>  url) {
        this.url = url;
    }

    public List<String> getRequiresPermissions() {
        return requiresPermissions;
    }

    public void setRequiresPermissions(List<String> requiresPermissions) {
        this.requiresPermissions = requiresPermissions;
    }

    public List<String>  getMethods() {
        return methods;
    }

    public void setMethods(List<String>  methods) {
        this.methods = methods;
    }

    public List<ParamTagImpl> getParamTag() {
        return paramTag;
    }

    public void setParamTag(List<ParamTagImpl> paramTag) {
        this.paramTag = paramTag;
    }

    public String getRespbody() {
        return respbody;
    }

    public void setRespbody(String respbody) {
        this.respbody = respbody;
    }

    public List<RespTagImpl> getRespParam() {
        return respParam;
    }

    public void setRespParam(List<RespTagImpl> respParam) {
        this.respParam = respParam;
    }

    public List<FieldInfo> getFieldInfos() {
        return fieldInfos;
    }

    public void setFieldInfos(List<FieldInfo> fieldInfos) {
        this.fieldInfos = fieldInfos;
    }

    public List<FieldInfo> getParamFieldInfos() {
        return paramFieldInfos;
    }

    public void setParamFieldInfos(List<FieldInfo> paramFieldInfos) {
        this.paramFieldInfos = paramFieldInfos;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRespData() {
        return respData;
    }

    public void setRespData(String respData) {
        this.respData = respData;
    }

    @Override
    public String toString() {
        return "ShowdocModel{" +
                "description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", url=" + url +
                ", requiresPermissions=" + requiresPermissions +
                ", methods=" + methods +
                ", paramTag=" + paramTag +
                ", paramFieldInfos=" + paramFieldInfos +
                ", fieldInfos=" + fieldInfos +
                ", respbody='" + respbody + '\'' +
                ", date='" + date + '\'' +
                ", respData='" + respData + '\'' +
                ", respParam=" + respParam +
                '}';
    }
}
