package headfirst.chapter07.listings.l01;

public class Surgeon extends Doctor {
    @Override
    void treatPatient() {
        System.out.println("Surgeon operates on a patient");
    }

    void makeIncision() {
        System.out.println("Surgeon makes an incision");
    }
}
