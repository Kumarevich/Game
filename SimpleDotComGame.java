public class SimpleDotComGame {
    public static void main(String[] args){
    int numOfGuesses = 0;
    
    SimpleDotCom TheDotCom = new SimpleDotCom();
    GameHelper helper = new GameHelper();
    
    int randomNum = (int) (Math.random()*5);
    int [] location = {randomNum,randomNum+1,randomNum+2};
    
    TheDotCom.setLocationCells(location);

    boolean isAlive = true;
    
    while(isAlive = true){
        String guess = helper.getUserInput("Введите число");
        String result = TheDotCom.checkYourself(guess);
        numOfGuesses++;
        if (result.equals("Потопил")) {
            isAlive = false;
            System.out.println("Вам понадобилось "+numOfGuesses+" попыток");
        }
    
        }
    }
}
