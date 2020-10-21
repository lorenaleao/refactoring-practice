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
}
