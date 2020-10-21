import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String startText = "<H1>Rentals for <EM>";
        String endText = "</EM></H1><P>\n";
        String result = writeHeader(aCustomer, startText, endText);
    
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            // show figures for each rental
            result += writeRentalInfo(each, "", ": ", "<BR>\n");
        }
        
        // add footer lines
        result += writeFooter(aCustomer, "<P>You owe <EM>", "</EM><P>\n", 
                                "On this rental you earned <EM>", "</EM> frequent renter points<P>");
        return result;
    }
}
