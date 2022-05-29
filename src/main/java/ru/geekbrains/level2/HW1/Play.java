package ru.geekbrains.level2.HW1;

public interface Play {

    public String name = null;
    public int maxRun = 0;
    public int maxJump = 0;

    boolean getSuccess();

    void setSuccess(boolean success);

    public void run();
    public void jump();
}
