public class Main {
    public static void main(String[] args) {
        Report reportTV = new Report.Builder()
                .setTitle("My Report")
                .setAuthor("Karakat")
                .setConclusion("Report is useful")
                .build();


        Report reportMagazine = new Report.Builder()
                .setTitle("Software Patterns")
                .setAuthor("Karakat Ibraim")
                .setConclusion("Good ")
                .build();


        System.out.println(reportTV);
        System.out.println(reportMagazine);
    }
}


