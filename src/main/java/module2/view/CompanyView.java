package module2.view;

import module2.dao.jdbc.JdbcCompanyDAOImpl;
import module2.model.Company;
import module2.util.DialogUtil;

public class CompanyView {
    JdbcCompanyDAOImpl companyDAO = new JdbcCompanyDAOImpl();

    public void startMainDialog() {
        System.out.println("\nPress '1' to add new Company");
        System.out.println("Press '2' to update Company");
        System.out.println("Press '3' to delete Company");
        System.out.println("Press '4' to get all Companies");
        System.out.println("Press '5' to get Company by ID");
//        System.out.println("Press '9' to go to previous step");
        System.out.println("Press '0' to exit\n");
        processUserChoice(DialogUtil.readInt());
    }

    private void processUserChoice(int usersChoice) {
        if (usersChoice == 1) {
            System.out.println("\nEnter new Company's name:\n");
            String companyName = DialogUtil.readString();
            companyDAO.save(new Company(1L, companyName));
            System.out.println("\nPress '1' if you want to continue:\n");
            processContinueChoice(DialogUtil.readInt());
        } else if (usersChoice == 2) {
            System.out.println("\nWhich company would you like to update?\n");
            String companyName = DialogUtil.readString();
            System.out.println("\nEnter new Company's name:\n");
            String newName = DialogUtil.readString();
            companyDAO.update(new Company(1L, companyName), newName);
            System.out.println("\nPress '1' if you want to continue:\n");
            processContinueChoice(DialogUtil.readInt());
        } else if (usersChoice == 3) {
            System.out.println("\nWhich company would you like to delete?\n");
            String companyName = DialogUtil.readString();
            companyDAO.delete(new Company(1L, companyName));
            System.out.println("\nPress '1' if you want to continue:\n");
            processContinueChoice(DialogUtil.readInt());
        } else if (usersChoice == 4) {
            System.out.println();
            for (Company c : companyDAO.getAll()) {
                System.out.println(c.toString());
            }
            System.out.println("\nPress '1' if you want to continue:\n");
            processContinueChoice(DialogUtil.readInt());
        } else if (usersChoice == 5) {
            System.out.println("\nEnter company's ID:\n");
            Long id = DialogUtil.readLong();
            System.out.println("\n" + companyDAO.getById(id).toString());
            System.out.println("\nPress '1' if you want to continue:\n");
            processContinueChoice(DialogUtil.readInt());
        } else if (usersChoice == 0) {
            DialogUtil.closeReader();
        } else {
            System.out.println("\nYou entered incorrect number, please try again:\n");
            processUserChoice(DialogUtil.readInt());
        }
    }

    private void processContinueChoice(int userChoice) {
        if (userChoice == 1) {
            startMainDialog();
        } else {
            DialogUtil.closeReader();
        }
    }
}