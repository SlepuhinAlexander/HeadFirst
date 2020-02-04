package headfirst.chapter8.listings.l5;

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
