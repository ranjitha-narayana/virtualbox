package streamproject;

import java.util.*;

class Demo {
    List<Product> demo = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);
    Product product = new Product();

    public void addPRODUCT() {
        for (int i = 0; i < 4; i++) ;
        {
            System.out.println("enter sl num");
            int sl_no = sc.nextInt();
            System.out.println("enter product name ");
            String productname = sc.next();
            System.out.println("enter QUANTITY ");
            int qty = sc.nextInt();
            System.out.println("enter price");
            int price = sc.nextInt();
            demo.add(new Product(sl_no, productname, qty, price));

        }
    }

    public void updateProduct() {
        System.out.println("enter the sl_no u want to update");
        int slno = sc.nextInt();
        for (int i = 0; i < demo.size(); i++) {
            Product product = demo.get(i);
            if (product.getSl_no() == slno) {
                demo.remove(product);
                System.out.println("enter sl num");
                int sl_no = sc.nextInt();
                System.out.println("enter product name ");
                String productname = sc.next();
                System.out.println("enter QUANTITY ");
                int qty = sc.nextInt();
                System.out.println("enter price");
                int price = sc.nextInt();
                demo.add(new Product(sl_no, productname, qty, price));
                break;
            } else {
                System.out.println("sl_no not found");

            }
        }
    }

    public void removeProduct() {
        System.out.println("ENTER the sl_no u want to delete");
        int num = sc.nextInt();
        for (int i = 0; i < demo.size(); i++) {
            Product product = demo.get(i);
            if (product.getSl_no() == num) {
                demo.remove(product);

                System.out.println("Successfully removed");
                break;
            } else {
                System.out.println("NOT FOUND!!!!");
            }

        }
    }

    public void DisplayProduct() {
        System.out.println(demo);

        /*demo.add(new Product(1,"ToothBrush",1,40));
        demo.add(new Product(2,"perfume",1,850));
        demo.add(new Product(3,"HairDryer",1,2000));
        demo.add(new Product(4,"Detergent",1,700));
        System.out.println(demo);
        //getting particular product using index
        System.out.println("\n displaying particular product"+demo.get(1));
        demo.forEach(prdt -> {
            System.out.println("\n productName : " + prdt.getProductname()+ ", Price : " + prdt.getPrice());
        });*/

    }

    public void SearchProduct() {
        System.out.println("ENTER the sl_no u want to search");
        int num = sc.nextInt();
        for (int i = 0; i < demo.size(); i++) {
            Product product = demo.get(i);
            if (product.getSl_no() == num) {
                System.out.println(product);
                break;
            } else {
                System.out.println("NOT FOUND!!!1");
            }

        }
    }
}
    public  class ProductDemo{
        public static void main(String[] args) {
            List<Product> demo = new ArrayList<Product>();

            Demo demo1 = new Demo();
            Scanner sc = new Scanner(System.in);
            int choice;
            do {
                System.out.println("1.addProduct");
                System.out.println("2.UpdateProduct");
                System.out.println("3.ReomveProduct");
                System.out.println("4.DisplayProduct");
                System.out.println("5.SearchProduct");
                System.out.println("6.EXIT");
                System.out.println("enter your choice");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        demo1.addPRODUCT();
                        break;
                    case 2:
                        demo1.updateProduct();
                        break;
                    case 3:
                        demo1.removeProduct();
                        break;
                    case 4:
                        demo1.DisplayProduct();
                        break;
                    case 5:
                        demo1.SearchProduct();
                        break;
                    case 6:
                        System.exit(0);
                }
            } while (choice != -1);
        }
    }



