import java.util.ArrayList;

public class ExceptionExample {

    public static void main(String[] args) {

        //예외(Exceptions)
//
//        int a = 10;
//        int b = 0;
//
//        int c = a / b;
//
        ArrayList arrayList = new ArrayList(3);


        try {
//            arrayList.get(10);

            int a = 10;
            int b = 0;
            int c = a / b;

        } catch(IndexOutOfBoundsException ioe){
            System.out.println("IndexOutOfBoundsException 발생");
            // e.printStackTrace(); <- 에러 내용 확인
            //System.out.println("에러발생");
        }catch(IllegalArgumentException iae) {
            System.out.println("IllegalArgumentException 발생");
        }catch (Exception e){
            System.out.println("Exception 발생");
        }finally {
            System.out.println("finally");
        }
        // e.printStackTrace(); <- 에러 내용 확인
    }
}
