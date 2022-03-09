package com.test.innerbean;

public class InvoiceGenerator {
    private Product prod_order;
    public InvoiceGenerator(Product prod_order)
    {
this.prod_order=prod_order;
}
public void setProdOrder(Product order){
this.prod_order=order;
    }
public void generateInvoice(){
        System.out.println("Getting Orders details...: "+"\nItem is:"+prod_order.getItem()+"\nAddress is:"+prod_order.getAddress()+"\nPrice is:"+prod_order.getPrice());

    }
}
