package com.example;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
    @Table(name = "CAR")
    public class Car {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "car_Id", nullable = false)
        int id;
        @Column(name = "COMPANY")
        String cCompany;
        @Column(name = "Type")
        String cType;
        @Column(name = "VARIANT")
        String cVariant;
        public Car(int cId, String cCompany, String cType, String cVariant) {
            this.id = cId;
            this.cCompany = cCompany;
            this.cType = cType;
            this.cVariant = cVariant;
        }

        public Car() {
        }

        public int getcId() {
            return id;
        }

        public void setcId(int id) {
            this.id = id;
        }

        public String getcCompany() {
            return cCompany;
        }

        public void setcCompany(String cCompany) {
            this.cCompany = cCompany;
        }

        public String getcType() {
            return cType;
        }

        public void setcType(String cType) {
            this.cType = cType;
        }

        public String getcVariant() {
            return cVariant;
        }

        public void setcVariant(String cVariant) {
            this.cVariant = cVariant;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "cId='" + id + '\'' +
                    ", cCompany='" + cCompany + '\'' +
                    ", cType='" + cType + '\'' +
                    ", cVariant='" + cVariant + '\'' +
                    '}';
        }

    }

