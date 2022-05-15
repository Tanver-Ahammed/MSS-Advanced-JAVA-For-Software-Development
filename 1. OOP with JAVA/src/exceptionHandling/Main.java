package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            String st = null;
            System.out.println(st.length());
            int n = Integer.parseInt("12p345");
            System.out.println(n);
            int result = 125 / 0;
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception happened");
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception happened");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception happened");
        } catch (Exception e) {
            System.out.println("In Based Exception branch");
        }


        System.out.println("\n");

        try {

            int n = Integer.parseInt("12p345");
            System.out.println(n);
            int result = 125 / 0;
            String st = null;
            System.out.println(st.length());
            System.out.println(result);

        }catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException|NumberFormatException e){
            System.out.println("The Exception is: "+e);
        }

    }
}
