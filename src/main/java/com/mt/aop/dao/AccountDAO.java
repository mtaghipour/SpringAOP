package com.mt.aop.dao;

import com.mt.aop.entities.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addDefaultAccount() {
        System.out.println("AccountDAO : Default account added ");
    }

    public void addDefaultAccount(Account account) {
        System.out.println("AccountDAO : " + account.toString());
    }

    public void addAdminAccount() {
        System.out.println("AccountDAO : Admin Account added");
    }

    public void updateAccount() {
        System.out.println("AccountDAO : Account updated");
    }

    public boolean isAccountValid() {
        System.out.println("AccountDAO : Account is valid");
        return true;
    }
}
