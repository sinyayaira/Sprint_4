package org.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (this.name == null) {return false;}

        if (this.name.length() < 3 || this.name.length() > 19) { return false;}

        int position = this.name.indexOf(" ");

        if (position < 1 || position == (this.name.length() -1) ) { return false;}

        if (position !=  this.name.lastIndexOf(" ")) {return false;}

        return true;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }
}
