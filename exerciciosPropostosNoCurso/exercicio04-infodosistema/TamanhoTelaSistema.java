import java.awt.*;

public class TamanhoTelaSistema {
    public static void main(String args[]) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.printf("A a largura de sua tela é %d, e a altura é %d.\n",dim.width,dim.height);
    }
}
