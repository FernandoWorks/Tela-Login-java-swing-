import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela_login_JAVASWING {

    public static void main(String[] args) {

        JFrame janela = new JFrame();
       JLabel usuarioTexto = new JLabel("usuario:");
usuarioTexto.setBounds(50, 40, 150, 30);

JPasswordField senha = new JPasswordField();
senha.setBounds(50, 180, 200, 40);

JLabel senhaTexto = new JLabel("senha:");
senhaTexto.setBounds(50, 140, 150, 30); 

JTextField UsuarioD = new JTextField();
UsuarioD.setBounds(50, 80, 200, 40);

      
        JButton botao = new JButton("logar");
        botao.setBounds(50, 230, 100, 50);

       
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setBounds(100, 100, 500, 500);

       
        janela.add(botao);
janela.add(usuarioTexto);
    janela.add(UsuarioD) ;   
    janela.add(senha);
    janela.add(senhaTexto);
    
    
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = UsuarioD.getText();
                 String senhaD = new String(senha.getPassword());
System.out.println("usuario: "+usuario);
System.out.println("senha: "+senhaD);

UsuarioD.setText("");
senha.setText("");

            }
        });

        
        janela.setVisible(true);
    }
}
