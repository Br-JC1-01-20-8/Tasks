package jc01_2020.test02;

public enum  Department {

    A1("Кухня"),
    A2("Рентген кабинет"),
    A3("МАЗ");

    private String value;

    Department(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static Department getDepartment(/*тут можно что-нибудь написать*/) {
        /*тут можно что-нибудь написать*/
        return null;
    }

}
