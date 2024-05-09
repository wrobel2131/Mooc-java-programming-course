
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author other21
 */
public class GradeService {
    private List<Integer> points;
    
    public GradeService() {
        this.points = new ArrayList<>();
    }
    
    void printGradeDistribution() {
        Map<Integer, Integer> gradeDistribution = this.createGradeDistributionMap();
        gradeDistribution.forEach((k, v) -> {
            System.out.println(k + ": " + this.printStars(v));
        });
    }
    
    
    
    public void addPoints(int points) {
        if(points >= 0 && points <=100) {
            this.points.add(points);
        }
    }
    
    public Double passingGradePointsAverage() {
        int count = this.passingGradeCountOfPoints();
        if(count == 0) {
            return -1.0;
        }
        return 1.0 * this.passingGradeSumOfPoints() / count;
    }
    
    public Double totalPointsAverage() {
        int count = this.totalCountOfPoints();
        if(count == 0) {
            return -1.0;
        }
        return 1.0 * this.totalSumOfPoints() / count;
    }
    
    public Double passPercentage() {
        Integer totalCount = this.totalCountOfPoints();
        Integer passingCount = this.passingGradeCountOfPoints();
        if(totalCount == 0 || passingCount == 0) {
            return -1.00;
        }
        return 100.0 * passingCount / totalCount;
    }
    
    private Integer passingGradeSumOfPoints() {
        return this.points
                .stream()
                .filter(p -> p >=50)
                .mapToInt(Integer::intValue)
                .sum();
    }
    
    private Integer passingGradeCountOfPoints() {
        return this.points
                .stream()
                .filter(p -> p >= 50)
                .collect(Collectors.toList())
                .size();
    }
    
    private Integer totalSumOfPoints() {
        return this.points
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
    
    private Integer totalCountOfPoints() {
        return this.points.size();
    }
    
    private Integer pointsToGrade(int points) {
        if(points < 0 || points > 100) {
            return -1;
        } else if(points >= 90) {
            return 5;
        } else if(points >= 80) {
            return 4;
        } else if(points >= 70) {
            return 3;
        } else if (points >= 60) {
            return 2;
        } else if(points >= 50) {
            return 1;
        } else {
            return 0;
        }
    }
    
    private String printStars(int number) {
        StringBuilder stars = new StringBuilder(number);
        for (int i = 0; i < number; i++) {
            stars.append('*');
        }
        return stars.toString();
    }
    
    private Map<Integer, Integer> createGradeDistributionMap() {
        Map<Integer, Integer> grades = this.initializeEmptyGradeMap();
        for(Integer p: this.points) {
            Integer gradeFromPoints = this.pointsToGrade(p);
            if(grades.containsKey(gradeFromPoints)) {
                grades.put(gradeFromPoints, grades.get(gradeFromPoints)+1);
            }
        }
        return grades;
    }
    
    private Map<Integer, Integer> initializeEmptyGradeMap() {
        Map<Integer, Integer> grades = new HashMap<>();
        for (int i = 0; i <= 5; i++) {
            grades.put(i, 0);
        }
        return grades;
    }
    
}
