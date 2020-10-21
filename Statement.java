import java.util.Enumeration;

public class Statement {
    public String writeHeader(Customer aCustomer,  String startText,  String endText) {
        return startText + aCustomer.getName() + endText;
    }

    public String writeRentalInfo(Rental aRental, String startText, String midText, String endText) {
        return startText + aRental.getMovie().getTitle()+ midText +
                String.valueOf(aRental.getCharge()) + endText;
    }

    public String writeFooter(Customer aCustomer, String s1, String s2, String s3, String s4) {
        return s1 + String.valueOf(aCustomer.getTotalCharge()) + s2 + s3 + 
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + s4;
    }

    public String value(Customer aCustomer, String h1, String h2, String r1, String r2, String r3, String f1, String f2, String f3, String f4) {
        Enumeration rentals = aCustomer.getRentals();
        String result = writeHeader(aCustomer, h1, h2);
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement(); 
            //show figures for this rental
            result += writeRentalInfo(each, r1, r2, r3);
        }

        //add footer lines
        result += writeFooter(aCustomer, f1, f2, f3, f4);
        return result;
    }
}
