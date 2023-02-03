package Classes;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            double randomNumber = Math.random();
            Fighter firstFighter, secondFighter;
            if (randomNumber <= 0.5){
                firstFighter = f1;
                secondFighter = f2;
            }else {
                firstFighter = f2;
                secondFighter = f1;
            }
            System.out.println("Maça : "+firstFighter.name+" Başlayacak.");
            while (firstFighter.health > 0 && secondFighter.health > 0){
                System.out.println("====YENİ ROUND====");
                secondFighter.health = firstFighter.hit(secondFighter);
                if (isWin()){
                    break;
                }
                firstFighter.health = secondFighter.hit(firstFighter);
                if (isWin()){
                    break;
                }
                System.out.println(firstFighter.name+" Sağlık : "+firstFighter.health);
                System.out.println(secondFighter.name+" Sağlık : "+secondFighter.health);
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor!");
        }
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if (this.f2.health == 0 ){
            System.out.println(f1.name+ " Kazandı.");
            return true;
        }
        if (this.f1.health == 0 ){
            System.out.println(f2.name+" Kazandı");
            return true;
        }
        return false;
    }
}
