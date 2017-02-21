package com.liutao.whatever;

/**
 * Created by liutao on 17-2-21.
 */
public enum Week {
    MON(1),TUE(2),WED(3), THU(4), FRI(5), SAT(6) {
//        @Override
//        public boolean isRest() {
//            return super.isRest();
//        }
    },
    SUN(0) {
        @Override
        public boolean isRest(){
            return true;
        }
    };
    private int value;

    private Week(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
    public boolean isRest() {
        return false;
    }
}
