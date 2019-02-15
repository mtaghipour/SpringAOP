package com.mt.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addUserAccount() {
        System.out.println("Account added to");
    }

    public void addAdminAccount() {
        System.out.println("Admin Account added");
    }

    public void updateAccount() {
        System.out.println("Account updated");
    }
}
