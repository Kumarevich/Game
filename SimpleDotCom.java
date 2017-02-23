public class SimpleDotCom {
    
    int[] locationCells;
    int numOfHits = 0;
    
    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    
    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess); //стринг в инт
        String result = "Мимо"; //результат
        for (int cell: locationCells) { //повторение для каждого элемента массива
            if (guess == cell) { //условие попадания
                result = "Попал"; //результат
                numOfHits++; //счетчик попаданий
                break; //прерывание цикла в результате попадания
            }
        }
        if (numOfHits == locationCells.length) { //условие потопления
            result = "Потопил"; //результат
        }
        System.out.println(result); //вывод результата
        return result; //возвращение результата
    }
    
}
