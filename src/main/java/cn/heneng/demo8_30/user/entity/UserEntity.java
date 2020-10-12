package cn.heneng.demo8_30.user.entity;

import java.util.Date;

public class UserEntity {
    private int id;
    private String username;
    private String password;
    private Date createtime;
    private Integer status;

    public UserEntity() {
    }

    public UserEntity(int id, String username, String password, Date createtime, Integer status) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.createtime = createtime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", status=" + status +
                '}';
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
