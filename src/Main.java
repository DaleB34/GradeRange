public class Main {
    public static void main(String[] args)
    {

        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};

        Grade A = new Grade("A", 95);
        Grade A2 = new Grade("A-", 90);
        Grade B = new Grade("B+", 87);
        Grade B2 = new Grade("B", 83);
        Grade B3 = new Grade("B-", 80);
        Grade C = new Grade("C+", 77);
        Grade C2 = new Grade("C", 73);
        Grade C3 = new Grade("C-", 70);
        Grade D = new Grade("D+", 67);
        Grade D2 = new Grade("D", 63);
        Grade D3 = new Grade("D-", 60);
        Grade F = new Grade("F", 0);


    }
}