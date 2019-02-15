package com.mt.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addUserAccount() {
        System.out.println("Membership added");
    }

}
