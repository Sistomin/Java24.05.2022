package ru.geekbrains.level2.HW1;

public class Cat {
        private String name;
        private int maxLength;
        private int maxHeight;
        private boolean success = true;

        public Cat(String name, int maxLength, int maxHeight) {
            this.name = name;
            this.maxLength = maxLength;
            this.maxHeight = maxHeight;
        }

        public String runCat(){
            return "Кот по имени " + name + " может пробежать " + maxHeight;
        }
        public String jumpCat(){
            return "Кот по имени " + name + " может прыгнуть в высоту " + maxHeight;
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
