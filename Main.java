
public class Main   {
    public static void main(String[] args) {
        NumberList<Integer> numberList = new NumberList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        for(Integer item : numberList){
            System.out.println(item);

        }

    }
}
