import javax.xml.transform.Result;

public class TaboadaNove {
    //Fazer um programa Java que imprima a tabela do 9 com o seguinte formato:
    //1 X 9 =9     2X 9 =18        10 X 9 = 90
    public static void main(String[] args) {
        int Mult;

        for (Mult = 1; Mult <= 10; Mult++){
            int Resultado = Mult * 9;

            System.out.println(Mult + "x 9 =" +Resultado);
        }

    }
}
