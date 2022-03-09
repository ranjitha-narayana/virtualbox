package streamproject;

public class Product {
    public int getSl_no() {
        return sl_no;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "sl_no=" + sl_no +
                ", productname='" + productname + '\'' +
                ", qty=" + qty +
                ", price=" + price +
                '}';
    }

    public Product(int sl_no, String productname, int qty, int price) {
        this.sl_no = sl_no;
        this.productname = productname;
        this.qty = qty;
        this.price = price;
    }

    public void setSl_no(int sl_no) {
        this.sl_no = sl_no;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int sl_no;
    String productname;
    int qty;
    int price;

}
