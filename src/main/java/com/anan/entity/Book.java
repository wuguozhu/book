package com.anan.entity;


public class Book {


    private Integer id;


    private String name;


    private Integer numeber;

    private Integer price;

    private String printshop;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumeber() {
        return numeber;
    }

    public void setNumeber(Integer numeber) {
        this.numeber = numeber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPrintshop() {
        return printshop;
    }

    public void setPrintshop(String printshop) {
        this.printshop = printshop;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numeber=" + numeber +
                ", price=" + price +
                ", printshop='" + printshop + '\'' +
                '}';
    }
}
