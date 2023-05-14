package pl.myTraverse.lessonFromFC.service;

public class RankCalculator {


    public static void main(String[] args) {

        int[] ranks={2,5,3,8,9,1,6};
        double calculate = calculate(ranks);
        System.out.println(calculate);

    }


    public static double calculate(int[] ranks){
        double sum=0;
        for (int rank : ranks) {
            sum += rank;
        }
        return sum/ ranks.length;
    }

}
