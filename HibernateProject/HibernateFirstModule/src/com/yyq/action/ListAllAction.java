package com.yyq.action;

import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;
import com.opensymphony.xwork2.ActionSupport;
import com.yyq.dao.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 * Created by gao on 16-4-26.
 */
public class ListAllAction extends ActionSupport {
    //使用@SessionTarget标注得到Hibernate Session
    @SessionTarget
    private Session session = null;
    //使用@TransactionTarget标注得到Hibernate Transaction
    @TransactionTarget
    private Transaction transaction = null;
    private List<UserEntity> users;

    public String list(){
        try{
            //得到user表中的所有记录
            users = session.createCriteria(UserEntity.class).list();
            transaction.commit();
            session.close();
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
    }

    public List<UserEntity> getUsers(){
        return users;
    }

    public void setUsers(List<UserEntity> users){
        this.users = users;
    }
}
