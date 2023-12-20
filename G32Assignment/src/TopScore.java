import java.util.*;

public class TopScore {
    //private Score[] topScore;
    private ArrayList<Score> topScore=new ArrayList<>();

    //Constructor
    public TopScore(){
    }

    //1 score
        public TopScore(Score s1){
        topScore.add(s1);
    }

    //2 scores
    public TopScore(Score s1, Score s2){
        topScore.add(s1);
        topScore.add(s2);
    }

    //3 scores
        public TopScore(Score s1, Score s2,Score s3){
        topScore.add(s1);
        topScore.add(s2);
        topScore.add(s3);
    }

    //4 scores
        public TopScore(Score s1, Score s2,Score s3,Score s4){
        topScore.add(s1);
        topScore.add(s2);
        topScore.add(s3);
        topScore.add(s4);
    }

    //5 scores
    public TopScore(Score s1, Score s2,Score s3,Score s4,Score s5){
        topScore.add(s1);
        topScore.add(s2);
        topScore.add(s3);
        topScore.add(s4);
        topScore.add(s5);
    }

    //Add Score Method
    public void addScore(Score s){
        topScore.add(s);
        Collections.sort(topScore,Collections.reverseOrder());
        if(topScore.size()>5){          
            int index=topScore.size()-1;
            topScore.remove(index);
        }
    }

    //toString
    public String toString(){
        StringBuilder result=new StringBuilder("TopScore \n");
        for (Score score:topScore){
            if (score !=null){
                result.append(score).append("\n\n");
            }
        }
        result.append("]");
        return result.toString();
    }
}