package ru.geekbrains.level2.HW1;

public class Robot {
        private String name;
        private int maxLength;
        private int maxHeight;
        private boolean success = true;

        public Robot(String name, int maxLength, int maxHeight) {
            this.name = name;
            this.maxLength = maxLength;
            this.maxHeight = maxHeight;
        }

        public String runRobot(){
            return "Робот по имени " + name + " может пробежать " + maxHeight;
        }
        public String jumpRobot(){
            return "Робот по имени " + name + " может прыгнуть в высоту " + maxHeight;
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
