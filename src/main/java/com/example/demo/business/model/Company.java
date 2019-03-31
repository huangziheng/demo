package group.rober.pdman.demo.entity;

import java.io.Serializable;
import java.util.Date;


public class Company implements Serializable,Cloneable{
    /** 字段id */
    private String id ;
    /** 公司名称 */
    private String companyName ;
    /** 公司id */
    private String companyId ;
    /** 地址 */
    private String address ;
    /** 手机号 */
    private String telephone ;

    /** 字段id */
    public String getId(){
        return this.id;
    }
    /** 字段id */
    public void setId(String id){
        this.id = id;
    }
    /** 公司名称 */
    public String getCompanyName(){
        return this.companyName;
    }
    /** 公司名称 */
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    /** 公司id */
    public String getCompanyId(){
        return this.companyId;
    }
    /** 公司id */
    public void setCompanyId(String companyId){
        this.companyId = companyId;
    }
    /** 地址 */
    public String getAddress(){
        return this.address;
    }
    /** 地址 */
    public void setAddress(String address){
        this.address = address;
    }
    /** 手机号 */
    public String getTelephone(){
        return this.telephone;
    }
    /** 手机号 */
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
}