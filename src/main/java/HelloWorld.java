import javax.swing.*;

public class HelloWorld extends JFrame {
    private JLabel panel1;

    public HelloWorld(){
        setContentPane(panel1);
        pack();
        System.out.println("Estive aqui - Rodrigo Correia");
        System.out.println("Estive aqui - Rodrigo");
        System.out.println("Estive aqui");
        System.out.println("Estou aqui loupatfer");
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
