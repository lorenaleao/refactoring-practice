import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String startText = "Rental Record for ";
        String endText = "\n";
        String result = writeHeader(aCustomer, startText, endText);
        
        String separator = "\t";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); 
            //show figures for this rental
            result += writeRentalInfo(each, separator, separator, endText);
        }

        //add footer lines
        result += writeFooter(aCustomer, "Amount owed is ", endText, 
                                "You earned ", " frequent renter points");
        return result;
    }
}
