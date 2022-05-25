package ru.geekbrains.level2.HW1;

public class Humman {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Humman(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public String runHumman(){
        return "Человек по имени " + name + " может пробежать " + maxHeight;
    }
    public String jumpHumman(){
        return "Человек по имени " + name + " может прыгнуть в высоту " + maxHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
