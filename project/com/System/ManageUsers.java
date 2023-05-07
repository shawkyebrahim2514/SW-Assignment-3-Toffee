package com.System;

import java.util.LinkedList;

import com.User.Admin;
import com.User.Buyer;

public class ManageUsers {
    private LinkedList<Buyer> buyers = new LinkedList<>();
    private LinkedList<Admin> admins = new LinkedList<>();

    public ManageUsers() {
        // create 10 buyers for test purpose and generate the correct arguments to the
        // constructor
        for (int i = 0; i < 10; i++) {
            buyers.add(new Buyer("Buyer" + i, "Buyer" + i + "@gmail.com", "0123456789", "Address" + i, "buyer" + i,
                    "buyer" + i));
        }
    }

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

    public Buyer getBuyer(String username) {
        for (Buyer buyer : buyers) {
            if (buyer.getUsername().equals(username))
                return buyer;
        }
        return null;
    }

    public void accessAdmin() {
    }

    public void suspendUser() {
    }
}
