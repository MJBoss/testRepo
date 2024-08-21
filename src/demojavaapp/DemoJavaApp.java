
package demojavaapp;


public class DemoJavaApp {

    public static void main(String[] args) {
        
      
//            Grades gr = new Grades();
//            gr.getName("Mike", 10111, 2.5, 1.8, 2.1, 2.1);
//            gr.displayGrade();

        Product pr = new Product();
        pr.addProduct(1011, 10, "Soap", 20);
        pr.viewProduct();

        Product pr1 = new Product();
        pr1.addProduct(1012, 0, "Cards", 20);
        pr1.viewProduct();
       
    }
    
}
