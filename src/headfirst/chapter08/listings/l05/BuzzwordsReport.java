package headfirst.chapter08.listings.l05;

public class BuzzwordsReport extends Report{
    @Override
    void runReport() {
        super.runReport();
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance() {
        System.out.println("Buzzword compliance");
    }
}
