/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.main;

import java.io.IOException;
import proyek.gui.Login;

/**
 *
 * @author Reyhan
 */
public class Main {
    
    public static void main(String[] args) throws IOException {
        Login appGui = new Login();
        appGui.setTitle("Login - SM4 Store Manager");
        appGui.setVisible(true);
    }
    
}
