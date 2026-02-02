public class Main
{
    public static void main(String[] args)
    {
        System.out.println("testing now");

        System.out.println();

        Senior irmoon = new Senior("Irmoon", 17, "M", "10026433", 4.35, "ADT", 12, false);
        System.out.println(irmoon);
        System.out.println("is he committed? " + irmoon.getCommitted());
        System.out.println(irmoon.status());

        System.out.println();

        Freshman nolan = new Freshman("Nolan", 15, "M", "UNKNOWN", 6.7, "ASI", 9, "Computer Science");
        System.out.println(nolan);
        System.out.println("what's his CTE pathway?" + nolan.getCtePathway());
        System.out.println(nolan.CTEPrint());
    }
}