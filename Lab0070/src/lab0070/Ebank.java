/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab0070;

import java.util.*;

/**
 *
 * @author ADMIN
 */
public class Ebank {
    Utility utility = new Utility();
    
    void loginVietNamese(List<Account> listAccount) {
        Locale localeVi = new Locale("vi");
        loginFunction(localeVi, listAccount);
    }
    
    public void mockData(List<Account> listAccount){
        listAccount.add(new Account("0123456789", "abc123456"));
        listAccount.add(new Account("0123456788", "abc123456"));
        listAccount.add(new Account("0123456787", "abc123456"));
        listAccount.add(new Account("0123456786", "abc123456"));
        listAccount.add(new Account("0123456785", "abc123456"));
    }

    void loginEnglish(List<Account> listAccount) {
        Locale localeVi = new Locale("en");
        loginFunction(localeVi, listAccount);
    }

    private void loginFunction(Locale locale, List<Account> listAccount) {
        ResourceBundle bundle = ResourceBundle.getBundle("language/message", locale);

        String username = utility.getString(bundle.getString("messageUsername"),
                bundle.getString("messageUsernameError"), utility.REGEX_USERNAME);

        String password = utility.getString(bundle.getString("messagePassword"),
                bundle.getString("messagePasswordError"), utility.REGEX_PASSWORD);

        handleCaptcha(bundle.getString("messageCaptcha"),
                bundle.getString("messageCaptchaInput"),
                bundle.getString("messageCaptchaError"));
        //tao doi tuong acccount
        Account account = new Account(username, password);
        //kiem tra account
        boolean isExistAccount = checkAccount(account, listAccount);
        if (isExistAccount) {
            System.out.println(bundle.getString("messageLoginSuccess"));
        } else {
            System.out.println(bundle.getString("messageLoginFail"));
        }
    }

    private boolean checkAccount(Account account, List<Account> listAccount) {
        for (Account obj : listAccount) {
            if (obj.getUsername().equals(account.getUsername())
                    && obj.getPassword().equals(account.getPassword())) {
                return true;
            }
        }
        return false;
    }

    private void handleCaptcha(String messageCaptcha, String msgInput, String error) {
        //generate captcha
        String generateCaptcha = generateCaptcha();
        System.out.println(messageCaptcha + generateCaptcha);
        
        while (true) {
            //input captcha
            String inputCaptcha = utility.getString(msgInput, "Captcha must be alphanumeric",
                    utility.REGEX_CAPTCHA);

            //compare captcha generate with input catpcha
            if (!generateCaptcha.contains(inputCaptcha)) {
                System.out.println(error);
            } else {
                break;
            }
        }

    }

    private String generateCaptcha() {
        Random random = new Random();

        int number;
        String captcha = "";
        for (int i = 0; i < 6; i++) {
            int base = Math.abs(random.nextInt()) % 62;
            if (base < 26) {
                number = 65 + base; // a-z
            } else if (base < 52) {
                number = 97 + (base - 26); // A-Z
            } else {
                number = base - 4; //0-9
            }

            char character = (char) number;
            captcha = captcha + character;
        }
        return captcha;
    }
    
}
