public class Uni5Ex10{
    public static void main(String[] args) {
        int count = 0;
        int num = 1;

        for (int i = 1; count < 10; i++) {
            String numStr = String.valueOf(num);
            int len = numStr.length();

            for (int j = 1; j < len; j++) {
                String leftPart = numStr.substring(0, j);
                String rightPart = numStr.substring(j);

                if (!leftPart.isEmpty() && !rightPart.isEmpty()) {
                    int left = Integer.parseInt(leftPart);
                    int right = Integer.parseInt(rightPart);
                    int sum = left + right;

                    if (sum * sum == num) {
                        System.out.println(num);
                        count++;
                        break;
                    }
                }
            }
            num++;
        }
    }
}