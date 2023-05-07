package com.System;

import com.User.Admin;
import com.User.Buyer;

public class ManageUsers {
    private Buyer[] buyers;
    private Admin[] admins;

    public boolean checkExistBuyer(String username) {
        for (Buyer buyer : buyers) {
            if (buyer.getUsername().equals(username))
                return true;
        }
        return false;
    }

    public boolean checkExistUser(String username, String password) {
        for (Buyer buyer : buyers) {
            if (buyer.getUsername().equals(username) && buyer.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public void addNewUser() {
    }

    public void accessAdmin() {
    }

    public void suspendUser() {
    }
}
