public class NameCalculator {
    public int calculate(String name){
        int sum = 0;

        for (char i : name.toLowerCase().toCharArray()) {

            if (i >= 'a' && i <= 'z') {
                sum += i - 'a' + 1;
            }

        }
        return sum;
    }
}
