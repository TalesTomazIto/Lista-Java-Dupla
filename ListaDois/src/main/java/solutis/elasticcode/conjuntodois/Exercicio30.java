package solutis.elasticcode.conjuntodois;

import java.awt.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio30 {
    public static int[] getArea(Point[] ret) {
        int minX = ret[0].x;
        int minY = ret[0].y;
        int maxX = ret[0].x;
        int maxY = ret[0].y;

        for (int i = 1; i < ret.length; i++) {
            minX = Math.min(minX, ret[i].x);
            minY = Math.min(minY, ret[i].y);
            maxX = Math.max(maxX, ret[i].x);
            maxY = Math.max(maxY, ret[i].y);
        }

        return new int[] {minX, minY, maxX, maxY};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point[] ret1 = new Point[4];
        Point[] ret2 = new Point[4];

        System.out.print("Digite os 4 vértices do primeiro retângulo (x,y): ");
        for (int i = 0; i < 4; i++) {
            ret1[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }

        System.out.print("Digite os 4 vértices do segundo retângulo (x,y): ");
        for (int i = 0; i < 4; i++) {
            ret2[i] = new Point(scanner.nextInt(), scanner.nextInt());
        }

        Set<String> ret1Hash = new HashSet<>();

        for (Point point : ret1) {
            ret1Hash.add(point.x + "," + point.y);
        }

        int pontosComuns = 0;

        for (Point point : ret2) {
            if (ret1Hash.contains(point.x + "," + point.y)) {
                pontosComuns++;
            }
        }

        if (pontosComuns == 4) {
            System.out.println("Os dois retângulos são idênticos.");
            System.exit(0);
        }

        int[] area1 = getArea(ret1);
        int[] area2 = getArea(ret2);

        boolean intersecao = area1[0] < area2[2] && area1[2] > area2[0] && area1[1] < area2[3] && area1[3] > area2[1];

        if (intersecao) {
            System.out.println("Os retângulos se sobrepoem.");
        } else {
            System.out.println("Os retângulos não se sobrepoem.");
        }
    }
}
