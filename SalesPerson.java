public class SalesPerson {

    // each object contains details of one salesperson

    private String id;

    private Sales[] salesHistory; // details of the different sales

    private int count = 0; // number of sales made



    //constructor for a new salesperson

    public SalesPerson(String id){

        this.id = id;
        this.salesHistory = new Sales[100];
    }



    // constructor for a salesperson transferred (together with their sales details) from another branch

    public SalesPerson(String id, Sales[] s, int c){

        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }



    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){

        salesHistory[count] = s;

        count = count +1;

    }



    public double calcTotalSales(){

        // calculates total sales for the salesperson

        double total = 0;
        for (int i = 0; i < count; i++) {
            total += salesHistory[i].getValue();
        }
        return total;
    }



    public Sales largestSale(){

        // calculates the sale with the largest value
        double largestSale = 0;
        Sales largestSalesSalesperson = null;
        for (int i = 0; i < count; i++) {
            double saleRevenue = salesHistory[i].getValue() * salesHistory[i].getQuantity();
            if (saleRevenue > largestSale) {
                largestSale = saleRevenue;
                largestSalesSalesperson = salesHistory[i];
            }
        }
        return largestSalesSalesperson;
    }

    public Sales getSalesHistory(int a) {
        if (a >= 0 && a < count) {
            return salesHistory[a];
        } else {
            return null;
        }
    }



}


