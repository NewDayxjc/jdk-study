package com.java.study.enums;

/**
 * @author XiongJinChen
 * @version 1.0
 * @date 2020/6/1 22:11
 * <p>
 * PissaEnum
 */

public class PissaEnum implements Cloneable {
    private PizzaStatus status;

    public enum PizzaStatus {
        ORDERED(5) {
            @Override
            public boolean isOrdered() {
                return true;
            }
        },
        READY(2) {
            @Override
            public boolean isReady() {
                return true;
            }
        },
        DELIVERED (0){
            @Override
            public boolean isDelivered() {
                return true;
            }
        };

        private int timeToDelivery;

        public boolean isOrdered() {return false;}

        public boolean isReady() {return false;}

        public boolean isDelivered(){return false;}

        public int getTimeToDelivery() {
            return timeToDelivery;
        }

        PizzaStatus (int timeToDelivery) {
            this.timeToDelivery = timeToDelivery;
        }
    }

    public boolean isDeliverable() {
        return this.status.isReady();
    }

    public void printTimeToDeliver() {
        System.out.println("Time to delivery is " +
                this.getStatus().getTimeToDelivery());
    }

    public PizzaStatus getStatus() {
        return status;
    }

    public void setStatus(PizzaStatus status) {
        this.status = status;
    }

    public static void main(String[] args) {
        PissaEnum pissaEnum=new PissaEnum();
        pissaEnum.setStatus(PissaEnum.PizzaStatus.READY);
        System.out.println(pissaEnum.isDeliverable());
    }
}
