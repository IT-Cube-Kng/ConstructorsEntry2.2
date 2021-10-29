package ru.itschool.module22;

public class Point {
    int x, y;

    public Point() {
        System.out.println("Вызов конструктора без аргументов");
    }

    public static String printPoint(Point p) {
        StringBuilder stringBuilder = new StringBuilder();
        int oX = p.x + 1;
        int oY = p.y + 1;

        for (int i = oY; i >= 0; i--) {
            for (int j = 0; j <= oX; j++) {
                if (i == p.y && j == p.x) stringBuilder.append("+");
                else if (i == oY && j == 0) stringBuilder.append("^");
                else if (j == oX && i == 0) stringBuilder.append(">");
                else if (j == 0) stringBuilder.append("|");
                else if (i == 0) stringBuilder.append("-");
                else stringBuilder.append("\s");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();

    }


    public static String printPoints(Point... points) {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.toString();
    }


}
