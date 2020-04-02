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

    public static Department getDepartment(String simpleName) {
        if (simpleName.contains("Повар")) return A1;
        else if (simpleName.contains("Доктор")) return A2;
        else return A3;
    }

}
