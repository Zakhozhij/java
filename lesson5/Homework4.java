
//На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
import java.util.HashMap;
import java.util.Map;

public class Homework4 {
    public static void main(String[] args) {
        setFigures();
    }

    private static void setFigures() {
        Integer setPos = 00;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String s1 = Integer.toString((i + 1));
                String s2 = Integer.toString((j + 1));
                setPos = Integer.valueOf(s1 + "" + s2);
                if (getCountFigures(setPos) == 8) {
                    System.out.println(setPos);
                }
            }
        }

    }

    private static int getCountFigures(Integer setPos) {
        int countFigures = 0;
        Map<Integer, String> pairs = new HashMap<>();
        String[][] desk = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                desk[i][j] = (i + 1) + "" + (j + 1);
            }
        }
        Boolean emptyDeskCheck = false;

        while (emptyDeskCheck != true) {
            emptyDeskCheck = true;
            if (countFigures != 0) {
                pairs.put(countFigures, Integer.toString(setPos));
            }
            // System.out.println("Текущее состояние шахматной доски!");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    // System.out.printf(desk[i][j] + " ");
                    if (desk[i][j].equals("FF") == false && desk[i][j].equals("  ") == false && countFigures != 0) {
                        String s1 = Integer.toString((i + 1));
                        String s2 = Integer.toString((j + 1));
                        setPos = Integer.valueOf(s1 + "" + s2);
                    }
                }
                // System.out.println();
            }

            if (desk[(setPos / 10) - 1][(setPos % 10) - 1].equals("FF") == false
                    && desk[(setPos / 10) - 1][(setPos % 10) - 1].equals("  ") == false) {
                int row = setPos / 10 - 1;
                int col = setPos % 10 - 1;

                for (int i = 0; i < 8; i++) {
                    desk[row][i] = "  ";
                }
                for (int i = 0; i < 8; i++) {
                    desk[i][col] = "  ";
                }
                int i = row;
                int j = col;
                while (i >= 0 && j >= 0) {
                    desk[i][j] = "  ";
                    j--;
                    i--;
                }
                i = row;
                j = col;
                while (i >= 0 && j < 8) {
                    desk[i][j] = "  ";
                    j++;
                    i--;
                }

                i = row;
                j = col;
                while (i < 8 && j >= 0) {
                    desk[i][j] = "  ";
                    j--;
                    i++;
                }
                i = row;
                j = col;
                while (i < 8 && j < 8) {
                    desk[i][j] = "  ";
                    j++;
                    i++;
                }

                desk[row][col] = "FF";
                countFigures++;
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (desk[i][j].equals("FF") == false && desk[i][j].equals("  ") == false) {
                        emptyDeskCheck = false;
                    }
                }
            }

        }
        if (countFigures == 8) {
            pairs.put(countFigures, Integer.toString(setPos));
            System.out.println("Текущее состояние шахматной доски!");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.printf(desk[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println(pairs);
        }

        return countFigures;

    }

}
