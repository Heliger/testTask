package com.company;

public class Task {

    public int task(float [][] pointsOfPolygon, float x, float y) {
        for (int i = 0; i < 4; i++) {
            if (pointsOfPolygon[i][0] == x && pointsOfPolygon[i][1] == y)
                return 0;
        }
        for (int i = 0; i < 4; i++) {
            if (function(pointsOfPolygon[i % 4], pointsOfPolygon[(i + 1) % 4], x, y) == 0
             && x >= pointsOfPolygon[i % 4][0]
             && x <= pointsOfPolygon[(i + 1) % 4][0]
             && y >= pointsOfPolygon[i % 4][1]
             && y <= pointsOfPolygon[(i + 1) % 4][1]) return 1;
        }
        if (function(pointsOfPolygon[0], pointsOfPolygon[1], x, y) < 0 &&
            function(pointsOfPolygon[1], pointsOfPolygon[2], x, y) < 0 &&
            function(pointsOfPolygon[2], pointsOfPolygon[3], x, y) < 0 &&
            function(pointsOfPolygon[3], pointsOfPolygon[0], x, y) < 0) return 3;
        else return 4;


    }

    private float function(float[] firstPoint, float[] secondPoint,
                           float x, float y){
        return (firstPoint[1] - secondPoint[1]) * x +
                (secondPoint[0] - firstPoint[0]) * y +
                (firstPoint[0] * secondPoint[1] - secondPoint[0] * firstPoint[1]);
    }

}
