public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        String endLine = "\n";
        String separator = "\t";
        
        return super.value(aCustomer, "Rental Record for ", endLine, separator, separator, endLine, "Amount owed is ", endLine, 
        "You earned ", " frequent renter points");
    }
}
