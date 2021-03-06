package com.rizwanindustries.app.gomarketplace.ModelClass.RegisterModel;

public class RegisterModel {

    private String email;
    private String first_name;
    private String last_name;
    private String password;
    private String confirm_password;
    private String is_merchant;
    private String merchant_name;

    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirm_password() {
        return confirm_password;
    }

    public String getIs_merchant() {
        return is_merchant;
    }

    public String getMerchant_name() {
        return merchant_name;
    }

    public RegisterModel(String email, String first_name, String last_name, String password, String confirm_password, String is_merchant, String merchant_name) {
        this.email = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.password = password;
        this.confirm_password = confirm_password;
        this.is_merchant = is_merchant;
        this.merchant_name = merchant_name;
    }
}
