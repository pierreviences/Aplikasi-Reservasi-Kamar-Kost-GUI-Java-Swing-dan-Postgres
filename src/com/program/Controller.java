package com.program;

import com.views.*;

public class Controller {

  private static LoginRegister frameLoginAndRegister = new LoginRegister();

  public static void showLoginUser() {
    frameLoginAndRegister.setVisible(false);
    frameLoginAndRegister.initsLoginUser();
    frameLoginAndRegister.setVisible(true);
  }

  public static void showDaftarUser() {
    frameLoginAndRegister.setVisible(false);
    frameLoginAndRegister.initsDaftarUser();
    frameLoginAndRegister.setVisible(true);
  }

  public static void showLoginAdmin() {
    frameLoginAndRegister.setVisible(false);
    frameLoginAndRegister.initsLoginAdmin();
    frameLoginAndRegister.setVisible(true);
  }

  public static void showDashboardUser(Integer id) {
    HalamanUser dashboardCustomer = new HalamanUser(id);
    dashboardCustomer.setVisible(true);
  }

  public static void showDashboardAdmin(boolean statusLogin) {
    HalamanAdmin dashboardAdmin = new HalamanAdmin(statusLogin);
    dashboardAdmin.setVisible(true);
  }

}
