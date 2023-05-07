package com.System;

import java.util.LinkedList;

import com.User.Admin;
import com.User.Buyer;

public class ManageUsers {
    private LinkedList<Buyer> buyers = new LinkedList<>();
    private LinkedList<Admin> admins = new LinkedList<>();

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

    public void addNewBuyer(Buyer newBuyer) {
        buyers.add(newBuyer);
    }

    public void accessAdmin() {
    }

    public void suspendUser() {
    }
}
