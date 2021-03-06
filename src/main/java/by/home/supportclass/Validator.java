package by.home.supportclass;


public class Validator {


    public boolean Registration(String login, String password, String confpassword, String email, String birthday, int checkLenght, String telephone, String address) {


        if (login.matches("^[A-Za-z0-9_-]{5,16}$")) {
            System.out.println("Login good");
        } else {
            System.out.println("Login Bad!");
            return false;
        }
        if (password.matches("^(?=^.{8,}$)((?=.*\\d)|(?=.*\\W+))(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$")) {
            System.out.println("Password good");
        } else {
            System.out.println("Password Bad!");
            return false;
        }

        if (password.equals(confpassword)) {
            System.out.println("Confirmation good");
        } else {
            System.out.println("Bad confirmation!");
            return false;
        }

        if (email.matches("^([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})$")) {
            System.out.println("email good!");
        } else {
            System.out.println("email bad!");
            return false;
        }
        if (checkLenght > 0) {
            System.out.println("Checkbox cheked!");
        } else {
            System.out.println("Checkbox has not beign cheked!");
            return false;
        }
        if (address.matches("^[а-яА-ЯёЁa-zA-Z0-9]+$")) {
            System.out.println("Address good!");
        } else {
            System.out.println("Address incorrect");
            return false;
        }
        if (telephone.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("Phone Good!");
        } else {
            System.out.println("Phone incorrect!");
            return false;
        }
        return true;
    }


}
