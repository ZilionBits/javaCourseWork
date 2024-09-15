public class InvoiceItemTest {
    public static void main(String[] args) {
        String id = "1";
        String desc = "Object of nothing";
        int qty = 50;
        double unitPrice = 0.5;

        InvoiceItem i = new InvoiceItem(id,desc,qty,unitPrice);

        System.out.println(i);
        System.out.println(i.getTotal());
    }
}
