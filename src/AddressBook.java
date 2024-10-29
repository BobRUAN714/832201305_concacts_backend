package com.ruoyi.system.domain;

public class AddressBook {
    private Long id;            // 主键ID
    private String name;        // 姓名
    private String phone;       // 电话
    private String email;       // 邮箱
    private String company;     // 公司
    private String position;    // 职位
    private String remark;      // 备注

    // 生成Getters和Setters方法
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }
}
