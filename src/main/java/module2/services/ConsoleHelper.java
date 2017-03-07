package module2.services;

import module2.util.DialogUtil;
import module2.view.*;

import java.io.IOException;

public class ConsoleHelper {
    CompanyView companyView = new CompanyView();
    CustomerView customerView = new CustomerView();
    DeveloperView developerView = new DeveloperView();
    ProjectView projectView = new ProjectView();
    SkillView skillView = new SkillView();


    public void start() {
        System.out.println("Press '1' to work with Companies");
        System.out.println("Press '2' to work with Customers");
        System.out.println("Press '3' to work with Developers");
        System.out.println("Press '4' to work with Projects");
        System.out.println("Press '5' to work with Skills");
        System.out.println("Press '0' to exit\n");
        processUserChoice(DialogUtil.readInt());
    }


    public void processUserChoice(int usersChoice) {
        if (usersChoice == 1) {
            companyView.startMainDialog();
        } else if (usersChoice == 2) {
            customerView.startMainDialog();
        } else if (usersChoice == 3) {
            developerView.startMainDialog();
        } else if (usersChoice == 4) {
            projectView.startMainDialog();
        } else if (usersChoice == 5) {
            skillView.startMainDialog();
        } else if (usersChoice == 0) {
            DialogUtil.closeReader();
        } else {
            System.out.println("You entered incorrect number, please try again:\n");
            processUserChoice(DialogUtil.readInt());
        }
    }
}
